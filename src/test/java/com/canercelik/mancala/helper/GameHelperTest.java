package com.canercelik.mancala.helper;

import com.canercelik.mancala.entity.PlayerEntity;
import com.canercelik.mancala.entity.game.GameEntity;
import com.canercelik.mancala.entity.pit.PitEntity;
import com.canercelik.mancala.enums.GameStatus;
import com.canercelik.mancala.enums.PitType;
import com.canercelik.mancala.enums.PlayerTurn;
import com.canercelik.mancala.service.impl.PitServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@ContextConfiguration(classes = {GameHelper.class})
@ExtendWith(SpringExtension.class)
class GameHelperTest {
    @MockBean
    private PitServiceImpl pitServiceImpl;

    @Mock
    PitServiceImpl pitService;
    @InjectMocks
    GameHelper gameHelper;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testPlay() {
        when(pitService.sow(any())).thenReturn(new PitEntity(0, PlayerTurn.FIRST, 0, PitType.HOUSE));
        when(pitService.sow(any(), anyInt())).thenReturn(new PitEntity(0, PlayerTurn.FIRST, 0, PitType.HOUSE));

        GameEntity result = gameHelper.play(new GameEntity(null, new PlayerEntity(null, "playerName", PlayerTurn.FIRST), new PlayerEntity(null, "playerName", PlayerTurn.FIRST), List.of(new PitEntity(0, PlayerTurn.FIRST, 0, PitType.HOUSE)), GameStatus.START, 0, PlayerTurn.FIRST), 0, PlayerTurn.FIRST);
        Assertions.assertEquals(new GameEntity(null, new PlayerEntity(null, "playerName", PlayerTurn.FIRST), new PlayerEntity(null, "playerName", PlayerTurn.FIRST), List.of(new PitEntity(0, PlayerTurn.FIRST, 0, PitType.HOUSE)), GameStatus.START, 0, PlayerTurn.FIRST), result);
    }

    /**
     * Method under test: {@link GameHelper#play(GameEntity, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPlay2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.util.List.get(int)" because "that" is null
        //       at com.canercelik.mancala.helper.GameHelper.sowSeeds(GameHelper.java:34)
        //       at com.canercelik.mancala.helper.GameHelper.play(GameHelper.java:28)
        //   In order to prevent play(GameEntity, int, PlayerTurn)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   play(GameEntity, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        gameHelper.play(new GameEntity(), 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#play(GameEntity, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPlay3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.canercelik.mancala.entity.game.GameEntity.getBoard()" because "gameEntity" is null
        //       at com.canercelik.mancala.helper.GameHelper.sowSeeds(GameHelper.java:33)
        //       at com.canercelik.mancala.helper.GameHelper.play(GameHelper.java:28)
        //   In order to prevent play(GameEntity, int, PlayerTurn)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   play(GameEntity, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        gameHelper.play(null, 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#play(GameEntity, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPlay4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 0
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.helper.GameHelper.sowSeeds(GameHelper.java:34)
        //       at com.canercelik.mancala.helper.GameHelper.play(GameHelper.java:28)
        //   In order to prevent play(GameEntity, int, PlayerTurn)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   play(GameEntity, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        GameEntity gameEntity = mock(GameEntity.class);
        when(gameEntity.getBoard()).thenReturn(new ArrayList<>());
        gameHelper.play(gameEntity, 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#play(GameEntity, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPlay5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 0
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.helper.GameHelper.sowSeeds(GameHelper.java:34)
        //       at com.canercelik.mancala.helper.GameHelper.play(GameHelper.java:28)
        //   In order to prevent play(GameEntity, int, PlayerTurn)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   play(GameEntity, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        GameEntity gameEntity = mock(GameEntity.class);
        when(gameEntity.getBoard()).thenReturn(new ArrayList<>());
        gameHelper.play(gameEntity, 1, PlayerTurn.SECOND);
    }

    /**
     * Method under test: {@link GameHelper#play(GameEntity, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPlay6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.helper.GameHelper.sowSeeds(GameHelper.java:42)
        //       at com.canercelik.mancala.helper.GameHelper.play(GameHelper.java:28)
        //   In order to prevent play(GameEntity, int, PlayerTurn)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   play(GameEntity, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        GameEntity gameEntity = mock(GameEntity.class);
        when(gameEntity.getBoard()).thenReturn(pitEntityList);
        gameHelper.play(gameEntity, 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#play(GameEntity, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPlay7() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.helper.GameHelper.sowSeeds(GameHelper.java:42)
        //       at com.canercelik.mancala.helper.GameHelper.play(GameHelper.java:28)
        //   In order to prevent play(GameEntity, int, PlayerTurn)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   play(GameEntity, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        when(pitServiceImpl.sow((PitEntity) any())).thenReturn(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));

        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        GameEntity gameEntity = mock(GameEntity.class);
        when(gameEntity.getBoard()).thenReturn(pitEntityList);
        gameHelper.play(gameEntity, 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#play(GameEntity, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPlay8() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.helper.GameHelper.verifyGameStatus(GameHelper.java:111)
        //       at com.canercelik.mancala.helper.GameHelper.sowSeeds(GameHelper.java:61)
        //       at com.canercelik.mancala.helper.GameHelper.play(GameHelper.java:28)
        //   In order to prevent play(GameEntity, int, PlayerTurn)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   play(GameEntity, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        when(pitServiceImpl.sow((PitEntity) any())).thenReturn(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));

        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(new PitEntity(1, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        GameEntity gameEntity = mock(GameEntity.class);
        when(gameEntity.getBoard()).thenReturn(pitEntityList);
        gameHelper.play(gameEntity, 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#play(GameEntity, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPlay9() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.helper.GameHelper.verifyGameStatus(GameHelper.java:111)
        //       at com.canercelik.mancala.helper.GameHelper.sowSeeds(GameHelper.java:61)
        //       at com.canercelik.mancala.helper.GameHelper.play(GameHelper.java:28)
        //   In order to prevent play(GameEntity, int, PlayerTurn)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   play(GameEntity, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        when(pitServiceImpl.sow((PitEntity) any())).thenReturn(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));

        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.STORE));
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        GameEntity gameEntity = mock(GameEntity.class);
        when(gameEntity.getBoard()).thenReturn(pitEntityList);
        gameHelper.play(gameEntity, 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#play(GameEntity, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPlay10() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.helper.GameHelper.verifyGameStatus(GameHelper.java:111)
        //       at com.canercelik.mancala.helper.GameHelper.sowSeeds(GameHelper.java:61)
        //       at com.canercelik.mancala.helper.GameHelper.play(GameHelper.java:28)
        //   In order to prevent play(GameEntity, int, PlayerTurn)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   play(GameEntity, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        when(pitServiceImpl.sow((PitEntity) any())).thenReturn(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));

        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(new PitEntity());
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        GameEntity gameEntity = mock(GameEntity.class);
        when(gameEntity.getBoard()).thenReturn(pitEntityList);
        gameHelper.play(gameEntity, 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#play(GameEntity, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPlay11() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.canercelik.mancala.entity.pit.PitEntity.take()" because the return value of "com.diffblue.cover.agent.readwrite.RuntimeWrappers.list$get(java.util.List, int)" is null
        //       at com.canercelik.mancala.helper.GameHelper.sowSeeds(GameHelper.java:34)
        //       at com.canercelik.mancala.helper.GameHelper.play(GameHelper.java:28)
        //   In order to prevent play(GameEntity, int, PlayerTurn)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   play(GameEntity, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        when(pitServiceImpl.sow((PitEntity) any())).thenReturn(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));

        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(null);
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        GameEntity gameEntity = mock(GameEntity.class);
        when(gameEntity.getBoard()).thenReturn(pitEntityList);
        gameHelper.play(gameEntity, 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#play(GameEntity, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPlay12() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.helper.GameHelper.verifyGameStatus(GameHelper.java:111)
        //       at com.canercelik.mancala.helper.GameHelper.sowSeeds(GameHelper.java:61)
        //       at com.canercelik.mancala.helper.GameHelper.play(GameHelper.java:28)
        //   In order to prevent play(GameEntity, int, PlayerTurn)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   play(GameEntity, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        when(pitServiceImpl.sow((PitEntity) any())).thenReturn(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        PitEntity pitEntity = mock(PitEntity.class);
        when(pitEntity.isEmpty()).thenReturn(true);
        when(pitEntity.getOwner()).thenReturn(PlayerTurn.FIRST);
        when(pitEntity.take()).thenReturn(1);

        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(pitEntity);
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        GameEntity gameEntity = mock(GameEntity.class);
        when(gameEntity.getBoard()).thenReturn(pitEntityList);
        gameHelper.play(gameEntity, 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#play(GameEntity, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPlay13() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 123 out of bounds for length 3
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.helper.GameHelper.sowSeeds(GameHelper.java:57)
        //       at com.canercelik.mancala.helper.GameHelper.play(GameHelper.java:28)
        //   In order to prevent play(GameEntity, int, PlayerTurn)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   play(GameEntity, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        when(pitServiceImpl.sow((PitEntity) any())).thenReturn(new PitEntity(1, PlayerTurn.FIRST, 123, PitType.HOUSE));
        PitEntity pitEntity = mock(PitEntity.class);
        when(pitEntity.isEmpty()).thenReturn(true);
        when(pitEntity.getOwner()).thenReturn(PlayerTurn.FIRST);
        when(pitEntity.take()).thenReturn(1);

        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(pitEntity);
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        GameEntity gameEntity = mock(GameEntity.class);
        when(gameEntity.getBoard()).thenReturn(pitEntityList);
        gameHelper.play(gameEntity, 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#play(GameEntity, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPlay14() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.canercelik.mancala.entity.pit.PitEntity.getOwner()" because the return value of "com.diffblue.cover.agent.readwrite.RuntimeWrappers.list$get(java.util.List, int)" is null
        //       at com.canercelik.mancala.helper.GameHelper.sowSeeds(GameHelper.java:54)
        //       at com.canercelik.mancala.helper.GameHelper.play(GameHelper.java:28)
        //   In order to prevent play(GameEntity, int, PlayerTurn)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   play(GameEntity, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        when(pitServiceImpl.sow((PitEntity) any())).thenReturn(null);
        PitEntity pitEntity = mock(PitEntity.class);
        when(pitEntity.isEmpty()).thenReturn(true);
        when(pitEntity.getOwner()).thenReturn(PlayerTurn.FIRST);
        when(pitEntity.take()).thenReturn(1);

        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(pitEntity);
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        GameEntity gameEntity = mock(GameEntity.class);
        when(gameEntity.getBoard()).thenReturn(pitEntityList);
        gameHelper.play(gameEntity, 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#play(GameEntity, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPlay15() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.helper.GameHelper.verifyGameStatus(GameHelper.java:111)
        //       at com.canercelik.mancala.helper.GameHelper.sowSeeds(GameHelper.java:61)
        //       at com.canercelik.mancala.helper.GameHelper.play(GameHelper.java:28)
        //   In order to prevent play(GameEntity, int, PlayerTurn)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   play(GameEntity, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        when(pitServiceImpl.sow((PitEntity) any())).thenReturn(mock(PitEntity.class));
        PitEntity pitEntity = mock(PitEntity.class);
        when(pitEntity.isEmpty()).thenReturn(true);
        when(pitEntity.getOwner()).thenReturn(PlayerTurn.FIRST);
        when(pitEntity.take()).thenReturn(1);

        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(pitEntity);
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        GameEntity gameEntity = mock(GameEntity.class);
        when(gameEntity.getBoard()).thenReturn(pitEntityList);
        gameHelper.play(gameEntity, 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#play(GameEntity, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPlay16() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 4 out of bounds for length 4
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.helper.GameHelper.sowSeeds(GameHelper.java:42)
        //       at com.canercelik.mancala.helper.GameHelper.play(GameHelper.java:28)
        //   In order to prevent play(GameEntity, int, PlayerTurn)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   play(GameEntity, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        when(pitServiceImpl.sow((PitEntity) any())).thenReturn(mock(PitEntity.class));
        PitEntity pitEntity = mock(PitEntity.class);
        when(pitEntity.isSowable((PlayerTurn) any())).thenReturn(true);
        when(pitEntity.isEmpty()).thenReturn(true);
        when(pitEntity.getOwner()).thenReturn(PlayerTurn.FIRST);
        when(pitEntity.take()).thenReturn(1);

        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(pitEntity);
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        GameEntity gameEntity = mock(GameEntity.class);
        when(gameEntity.getBoard()).thenReturn(pitEntityList);
        gameHelper.play(gameEntity, 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#play(GameEntity, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPlay17() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.canercelik.mancala.entity.pit.PitEntity.isEmpty()" because the return value of "com.diffblue.cover.agent.readwrite.RuntimeWrappers.list$get(java.util.List, int)" is null
        //       at com.canercelik.mancala.helper.GameHelper.verifyGameStatus(GameHelper.java:111)
        //       at com.canercelik.mancala.helper.GameHelper.sowSeeds(GameHelper.java:61)
        //       at com.canercelik.mancala.helper.GameHelper.play(GameHelper.java:28)
        //   In order to prevent play(GameEntity, int, PlayerTurn)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   play(GameEntity, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        when(pitServiceImpl.sow((PitEntity) any())).thenReturn(mock(PitEntity.class));
        PitEntity pitEntity = mock(PitEntity.class);
        when(pitEntity.isSowable((PlayerTurn) any())).thenReturn(true);
        when(pitEntity.isEmpty()).thenReturn(true);
        when(pitEntity.getOwner()).thenReturn(PlayerTurn.FIRST);
        when(pitEntity.take()).thenReturn(1);

        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        pitEntityList.add(null);
        pitEntityList.add(new PitEntity(1, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(pitEntity);
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        GameEntity gameEntity = mock(GameEntity.class);
        when(gameEntity.getBoard()).thenReturn(pitEntityList);
        gameHelper.play(gameEntity, 1, PlayerTurn.FIRST);
    }

    @Test
    void testSowSeeds() {
        when(pitService.sow(any())).thenReturn(new PitEntity(0, PlayerTurn.FIRST, 0, PitType.HOUSE));
        when(pitService.sow(any(), anyInt())).thenReturn(new PitEntity(0, PlayerTurn.FIRST, 0, PitType.HOUSE));

        GameEntity result = gameHelper.sowSeeds(new GameEntity(null, new PlayerEntity(null, "playerName", PlayerTurn.FIRST), new PlayerEntity(null, "playerName", PlayerTurn.FIRST), List.of(new PitEntity(0, PlayerTurn.FIRST, 0, PitType.HOUSE)), GameStatus.START, 0, PlayerTurn.FIRST), 0, PlayerTurn.FIRST);
        Assertions.assertEquals(new GameEntity(null, new PlayerEntity(null, "playerName", PlayerTurn.FIRST), new PlayerEntity(null, "playerName", PlayerTurn.FIRST), List.of(new PitEntity(0, PlayerTurn.FIRST, 0, PitType.HOUSE)), GameStatus.START, 0, PlayerTurn.FIRST), result);
    }

    /**
     * Method under test: {@link GameHelper#sowSeeds(GameEntity, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSowSeeds2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.util.List.get(int)" because "that" is null
        //       at com.canercelik.mancala.helper.GameHelper.sowSeeds(GameHelper.java:34)
        //   In order to prevent sowSeeds(GameEntity, int, PlayerTurn)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   sowSeeds(GameEntity, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        gameHelper.sowSeeds(new GameEntity(), 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#sowSeeds(GameEntity, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSowSeeds3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.canercelik.mancala.entity.game.GameEntity.getBoard()" because "gameEntity" is null
        //       at com.canercelik.mancala.helper.GameHelper.sowSeeds(GameHelper.java:33)
        //   In order to prevent sowSeeds(GameEntity, int, PlayerTurn)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   sowSeeds(GameEntity, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        gameHelper.sowSeeds(null, 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#sowSeeds(GameEntity, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSowSeeds4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 0
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.helper.GameHelper.sowSeeds(GameHelper.java:34)
        //   In order to prevent sowSeeds(GameEntity, int, PlayerTurn)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   sowSeeds(GameEntity, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        GameEntity gameEntity = mock(GameEntity.class);
        when(gameEntity.getBoard()).thenReturn(new ArrayList<>());
        gameHelper.sowSeeds(gameEntity, 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#sowSeeds(GameEntity, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSowSeeds5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 0
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.helper.GameHelper.sowSeeds(GameHelper.java:34)
        //   In order to prevent sowSeeds(GameEntity, int, PlayerTurn)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   sowSeeds(GameEntity, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        GameEntity gameEntity = mock(GameEntity.class);
        when(gameEntity.getBoard()).thenReturn(new ArrayList<>());
        gameHelper.sowSeeds(gameEntity, 1, PlayerTurn.SECOND);
    }

    /**
     * Method under test: {@link GameHelper#sowSeeds(GameEntity, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSowSeeds6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.helper.GameHelper.sowSeeds(GameHelper.java:42)
        //   In order to prevent sowSeeds(GameEntity, int, PlayerTurn)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   sowSeeds(GameEntity, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        GameEntity gameEntity = mock(GameEntity.class);
        when(gameEntity.getBoard()).thenReturn(pitEntityList);
        gameHelper.sowSeeds(gameEntity, 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#sowSeeds(GameEntity, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSowSeeds7() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.helper.GameHelper.sowSeeds(GameHelper.java:42)
        //   In order to prevent sowSeeds(GameEntity, int, PlayerTurn)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   sowSeeds(GameEntity, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        when(pitServiceImpl.sow((PitEntity) any())).thenReturn(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));

        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        GameEntity gameEntity = mock(GameEntity.class);
        when(gameEntity.getBoard()).thenReturn(pitEntityList);
        gameHelper.sowSeeds(gameEntity, 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#sowSeeds(GameEntity, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSowSeeds8() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.helper.GameHelper.verifyGameStatus(GameHelper.java:111)
        //       at com.canercelik.mancala.helper.GameHelper.sowSeeds(GameHelper.java:61)
        //   In order to prevent sowSeeds(GameEntity, int, PlayerTurn)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   sowSeeds(GameEntity, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        when(pitServiceImpl.sow((PitEntity) any())).thenReturn(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));

        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(new PitEntity(1, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        GameEntity gameEntity = mock(GameEntity.class);
        when(gameEntity.getBoard()).thenReturn(pitEntityList);
        gameHelper.sowSeeds(gameEntity, 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#sowSeeds(GameEntity, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSowSeeds9() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.helper.GameHelper.verifyGameStatus(GameHelper.java:111)
        //       at com.canercelik.mancala.helper.GameHelper.sowSeeds(GameHelper.java:61)
        //   In order to prevent sowSeeds(GameEntity, int, PlayerTurn)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   sowSeeds(GameEntity, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        when(pitServiceImpl.sow((PitEntity) any())).thenReturn(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));

        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.STORE));
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        GameEntity gameEntity = mock(GameEntity.class);
        when(gameEntity.getBoard()).thenReturn(pitEntityList);
        gameHelper.sowSeeds(gameEntity, 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#sowSeeds(GameEntity, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSowSeeds10() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.helper.GameHelper.verifyGameStatus(GameHelper.java:111)
        //       at com.canercelik.mancala.helper.GameHelper.sowSeeds(GameHelper.java:61)
        //   In order to prevent sowSeeds(GameEntity, int, PlayerTurn)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   sowSeeds(GameEntity, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        when(pitServiceImpl.sow((PitEntity) any())).thenReturn(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));

        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(new PitEntity());
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        GameEntity gameEntity = mock(GameEntity.class);
        when(gameEntity.getBoard()).thenReturn(pitEntityList);
        gameHelper.sowSeeds(gameEntity, 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#sowSeeds(GameEntity, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSowSeeds11() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.canercelik.mancala.entity.pit.PitEntity.take()" because the return value of "com.diffblue.cover.agent.readwrite.RuntimeWrappers.list$get(java.util.List, int)" is null
        //       at com.canercelik.mancala.helper.GameHelper.sowSeeds(GameHelper.java:34)
        //   In order to prevent sowSeeds(GameEntity, int, PlayerTurn)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   sowSeeds(GameEntity, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        when(pitServiceImpl.sow((PitEntity) any())).thenReturn(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));

        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(null);
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        GameEntity gameEntity = mock(GameEntity.class);
        when(gameEntity.getBoard()).thenReturn(pitEntityList);
        gameHelper.sowSeeds(gameEntity, 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#sowSeeds(GameEntity, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSowSeeds12() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.helper.GameHelper.verifyGameStatus(GameHelper.java:111)
        //       at com.canercelik.mancala.helper.GameHelper.sowSeeds(GameHelper.java:61)
        //   In order to prevent sowSeeds(GameEntity, int, PlayerTurn)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   sowSeeds(GameEntity, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        when(pitServiceImpl.sow((PitEntity) any())).thenReturn(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        PitEntity pitEntity = mock(PitEntity.class);
        when(pitEntity.isEmpty()).thenReturn(true);
        when(pitEntity.getOwner()).thenReturn(PlayerTurn.FIRST);
        when(pitEntity.take()).thenReturn(1);

        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(pitEntity);
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        GameEntity gameEntity = mock(GameEntity.class);
        when(gameEntity.getBoard()).thenReturn(pitEntityList);
        gameHelper.sowSeeds(gameEntity, 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#sowSeeds(GameEntity, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSowSeeds13() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 123 out of bounds for length 3
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.helper.GameHelper.sowSeeds(GameHelper.java:57)
        //   In order to prevent sowSeeds(GameEntity, int, PlayerTurn)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   sowSeeds(GameEntity, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        when(pitServiceImpl.sow((PitEntity) any())).thenReturn(new PitEntity(1, PlayerTurn.FIRST, 123, PitType.HOUSE));
        PitEntity pitEntity = mock(PitEntity.class);
        when(pitEntity.isEmpty()).thenReturn(true);
        when(pitEntity.getOwner()).thenReturn(PlayerTurn.FIRST);
        when(pitEntity.take()).thenReturn(1);

        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(pitEntity);
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        GameEntity gameEntity = mock(GameEntity.class);
        when(gameEntity.getBoard()).thenReturn(pitEntityList);
        gameHelper.sowSeeds(gameEntity, 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#sowSeeds(GameEntity, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSowSeeds14() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.canercelik.mancala.entity.pit.PitEntity.getOwner()" because the return value of "com.diffblue.cover.agent.readwrite.RuntimeWrappers.list$get(java.util.List, int)" is null
        //       at com.canercelik.mancala.helper.GameHelper.sowSeeds(GameHelper.java:54)
        //   In order to prevent sowSeeds(GameEntity, int, PlayerTurn)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   sowSeeds(GameEntity, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        when(pitServiceImpl.sow((PitEntity) any())).thenReturn(null);
        PitEntity pitEntity = mock(PitEntity.class);
        when(pitEntity.isEmpty()).thenReturn(true);
        when(pitEntity.getOwner()).thenReturn(PlayerTurn.FIRST);
        when(pitEntity.take()).thenReturn(1);

        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(pitEntity);
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        GameEntity gameEntity = mock(GameEntity.class);
        when(gameEntity.getBoard()).thenReturn(pitEntityList);
        gameHelper.sowSeeds(gameEntity, 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#sowSeeds(GameEntity, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSowSeeds15() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.helper.GameHelper.verifyGameStatus(GameHelper.java:111)
        //       at com.canercelik.mancala.helper.GameHelper.sowSeeds(GameHelper.java:61)
        //   In order to prevent sowSeeds(GameEntity, int, PlayerTurn)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   sowSeeds(GameEntity, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        when(pitServiceImpl.sow((PitEntity) any())).thenReturn(mock(PitEntity.class));
        PitEntity pitEntity = mock(PitEntity.class);
        when(pitEntity.isEmpty()).thenReturn(true);
        when(pitEntity.getOwner()).thenReturn(PlayerTurn.FIRST);
        when(pitEntity.take()).thenReturn(1);

        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(pitEntity);
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        GameEntity gameEntity = mock(GameEntity.class);
        when(gameEntity.getBoard()).thenReturn(pitEntityList);
        gameHelper.sowSeeds(gameEntity, 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#sowSeeds(GameEntity, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSowSeeds16() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 4 out of bounds for length 4
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.helper.GameHelper.sowSeeds(GameHelper.java:42)
        //   In order to prevent sowSeeds(GameEntity, int, PlayerTurn)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   sowSeeds(GameEntity, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        when(pitServiceImpl.sow((PitEntity) any())).thenReturn(mock(PitEntity.class));
        PitEntity pitEntity = mock(PitEntity.class);
        when(pitEntity.isSowable((PlayerTurn) any())).thenReturn(true);
        when(pitEntity.isEmpty()).thenReturn(true);
        when(pitEntity.getOwner()).thenReturn(PlayerTurn.FIRST);
        when(pitEntity.take()).thenReturn(1);

        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(pitEntity);
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        GameEntity gameEntity = mock(GameEntity.class);
        when(gameEntity.getBoard()).thenReturn(pitEntityList);
        gameHelper.sowSeeds(gameEntity, 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#sowSeeds(GameEntity, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSowSeeds17() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.canercelik.mancala.entity.pit.PitEntity.isEmpty()" because the return value of "com.diffblue.cover.agent.readwrite.RuntimeWrappers.list$get(java.util.List, int)" is null
        //       at com.canercelik.mancala.helper.GameHelper.verifyGameStatus(GameHelper.java:111)
        //       at com.canercelik.mancala.helper.GameHelper.sowSeeds(GameHelper.java:61)
        //   In order to prevent sowSeeds(GameEntity, int, PlayerTurn)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   sowSeeds(GameEntity, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        when(pitServiceImpl.sow((PitEntity) any())).thenReturn(mock(PitEntity.class));
        PitEntity pitEntity = mock(PitEntity.class);
        when(pitEntity.isSowable((PlayerTurn) any())).thenReturn(true);
        when(pitEntity.isEmpty()).thenReturn(true);
        when(pitEntity.getOwner()).thenReturn(PlayerTurn.FIRST);
        when(pitEntity.take()).thenReturn(1);

        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        pitEntityList.add(null);
        pitEntityList.add(new PitEntity(1, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(pitEntity);
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        GameEntity gameEntity = mock(GameEntity.class);
        when(gameEntity.getBoard()).thenReturn(pitEntityList);
        gameHelper.sowSeeds(gameEntity, 1, PlayerTurn.FIRST);
    }

    @Test
    void testCapture() {
        when(pitService.sow(any(), anyInt())).thenReturn(new PitEntity(0, PlayerTurn.FIRST, 0, PitType.HOUSE));

        List<PitEntity> result = gameHelper.capture(List.of(new PitEntity(0, PlayerTurn.FIRST, 0, PitType.HOUSE)), 0, PlayerTurn.FIRST);
        Assertions.assertEquals(List.of(new PitEntity(0, PlayerTurn.FIRST, 0, PitType.HOUSE)), result);
    }

    /**
     * Method under test: {@link GameHelper#capture(List, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCapture2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 0
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.helper.GameHelper.capture(GameHelper.java:129)
        //   In order to prevent capture(List, int, PlayerTurn)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   capture(List, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        gameHelper.capture(new ArrayList<>(), 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#capture(List, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCapture3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 0
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.helper.GameHelper.capture(GameHelper.java:129)
        //   In order to prevent capture(List, int, PlayerTurn)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   capture(List, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        gameHelper.capture(new ArrayList<>(), 1, PlayerTurn.SECOND);
    }

    /**
     * Method under test: {@link GameHelper#capture(List, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCapture4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 123 out of bounds for length 2
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.helper.GameHelper.capture(GameHelper.java:131)
        //   In order to prevent capture(List, int, PlayerTurn)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   capture(List, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        gameHelper.capture(pitEntityList, 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#capture(List, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCapture5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 6 out of bounds for length 2
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.helper.GameHelper.sowStore(GameHelper.java:136)
        //       at com.canercelik.mancala.helper.GameHelper.capture(GameHelper.java:132)
        //   In order to prevent capture(List, int, PlayerTurn)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   capture(List, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 1, PitType.HOUSE));
        gameHelper.capture(pitEntityList, 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#capture(List, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCapture6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 123 out of bounds for length 2
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.helper.GameHelper.capture(GameHelper.java:131)
        //   In order to prevent capture(List, int, PlayerTurn)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   capture(List, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.STORE));
        gameHelper.capture(pitEntityList, 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#capture(List, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCapture7() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.canercelik.mancala.entity.pit.PitEntity.take()" because the return value of "com.diffblue.cover.agent.readwrite.RuntimeWrappers.list$get(java.util.List, int)" is null
        //       at com.canercelik.mancala.helper.GameHelper.capture(GameHelper.java:129)
        //   In order to prevent capture(List, int, PlayerTurn)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   capture(List, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(null);
        gameHelper.capture(pitEntityList, 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#capture(List, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCapture8() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 123 out of bounds for length 2
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.helper.GameHelper.capture(GameHelper.java:131)
        //   In order to prevent capture(List, int, PlayerTurn)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   capture(List, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        PitEntity pitEntity = mock(PitEntity.class);
        when(pitEntity.getOppositeId()).thenReturn(123);
        when(pitEntity.take()).thenReturn(1);

        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(pitEntity);
        gameHelper.capture(pitEntityList, 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#capture(List, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCapture9() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 6 out of bounds for length 2
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.helper.GameHelper.sowStore(GameHelper.java:136)
        //       at com.canercelik.mancala.helper.GameHelper.capture(GameHelper.java:132)
        //   In order to prevent capture(List, int, PlayerTurn)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   capture(List, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        PitEntity pitEntity = mock(PitEntity.class);
        when(pitEntity.getOppositeId()).thenReturn(1);
        when(pitEntity.take()).thenReturn(1);

        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(pitEntity);
        gameHelper.capture(pitEntityList, 1, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#capture(List, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCapture10() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 13 out of bounds for length 2
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.helper.GameHelper.sowStore(GameHelper.java:139)
        //       at com.canercelik.mancala.helper.GameHelper.capture(GameHelper.java:132)
        //   In order to prevent capture(List, int, PlayerTurn)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   capture(List, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        PitEntity pitEntity = mock(PitEntity.class);
        when(pitEntity.getOppositeId()).thenReturn(1);
        when(pitEntity.take()).thenReturn(1);

        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        pitEntityList.add(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        pitEntityList.add(pitEntity);
        gameHelper.capture(pitEntityList, 1, PlayerTurn.SECOND);
    }

    @Test
    void testSowStore() {
        when(pitService.sow(any(), anyInt())).thenReturn(new PitEntity(0, PlayerTurn.FIRST, 0, PitType.HOUSE));

        List<PitEntity> result = gameHelper.sowStore(List.of(new PitEntity(0, PlayerTurn.FIRST, 0, PitType.HOUSE)), 0, PlayerTurn.FIRST);
        Assertions.assertEquals(List.of(new PitEntity(0, PlayerTurn.FIRST, 0, PitType.HOUSE)), result);
    }

    /**
     * Method under test: {@link GameHelper#sowStore(List, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSowStore2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 6 out of bounds for length 0
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.helper.GameHelper.sowStore(GameHelper.java:136)
        //   In order to prevent sowStore(List, int, PlayerTurn)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   sowStore(List, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        gameHelper.sowStore(new ArrayList<>(), 42, PlayerTurn.FIRST);
    }

    /**
     * Method under test: {@link GameHelper#sowStore(List, int, PlayerTurn)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSowStore3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 13 out of bounds for length 0
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.helper.GameHelper.sowStore(GameHelper.java:139)
        //   In order to prevent sowStore(List, int, PlayerTurn)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   sowStore(List, int, PlayerTurn).
        //   See https://diff.blue/R013 to resolve this issue.

        gameHelper.sowStore(new ArrayList<>(), 42, PlayerTurn.SECOND);
    }
}