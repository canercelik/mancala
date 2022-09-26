const BASE_URL = `${window.location.origin}`;

/**
 * Player turns and moves will be handled here first
 * It will reduce the workload of Spring by eliminating
 * wrong move requests.
 *
 * But of course there is a verification process
 * in the backend, too.
 *
 */

function validateMove(pitId){
    if(gameData.board[pitId].owner != findPlayerTypeByName()){
        alert("Please click on your pits ^__^");
    }
    else if(document.getElementById("pit-"+pitId).textContent == "0"){
        alert("Please choose a non empty pit ^__^");
    }
    else {
        playMove(pitId);
    }
}

async function playMove(pit_id) {
    const moveUrl = `${BASE_URL}/play`;

    const gamePlayEntity = {
        uuid: gameData.uuid,
        playerTurn: findPlayerTypeByName(),
        pitIndex: pit_id
    };

    const moveResponse = await fetch(moveUrl, {
        headers: {
            "Content-Type": "application/json;charset=utf-8"
        },
        method: "PUT",
        body: JSON.stringify(gamePlayEntity)
    });
    data = await moveResponse.json();

    if (moveResponse.ok) {
        updateView(data);
        updateBoard(data.board);

         if(data.status == "END") {
             calculateWinner(data);
                 document.getElementById("winner").style.visibility = "visible";
             //document.getElementById("winner").addClass("visible");
             //document.getElementById("new-game").removeClass("hidden");
             //document.getElementById("new-game").addClass("visible");
             document.getElementById("new-game").style.visibility = "visible";
         }

    }
}

function calculateWinner(data){
    if(data.board[(data.board.length/2)-1].seeds > data.board[(data.board.length)-1].seeds){
        document.getElementById("winner-player").innerText = gameData.firstPlayerEntity.playerName;
    }
    else if(data.board[(data.board.length/2)-1].seeds < data.board[(data.board.length)-1].seeds){
        document.getElementById("winner-player").innerText = gameData.secondPlayerEntity.playerName;
    }
    else document.getElementById("winner-player").innerText = "DRAW";
}

function findPlayerTypeByName(){
    const currentPlayer = document.getElementById("player-turn").innerText;
    if(gameData.firstPlayerEntity.playerName == currentPlayer){
        return "FIRST";
    } else{
        return "SECOND";
    }
}

function updateView(data){
    document.getElementById("game-status").innerText = data.status;
    document.getElementById("total-turn").innerText = data.totalTurn;
    updatePlayerTurn(data.playerTurn);
}

function updatePlayerTurn (playerOrder) {
    if(playerOrder === "FIRST"){
        document.getElementById("player-turn").innerText = gameData.firstPlayerEntity.playerName;
    } else{
        document.getElementById("player-turn").innerText = gameData.secondPlayerEntity.playerName;
    }
}

function updateBoard(board){
    board.forEach((item, index) => {
        document.getElementById("pit-" +index).innerText = item.seeds;
    })
}


