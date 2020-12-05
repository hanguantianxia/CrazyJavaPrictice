import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ShowHand {
    private final int PLAY_NUM = 5;
    private String[] types = {"方块", "草花", "红心", "黑桃"};
    private String[] values = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

    private List<String> cards = new LinkedList<String>();

    private String[] players = new String[PLAY_NUM];

    private List<String>[] playersCards = new List[PLAY_NUM];

    public void initCards(){
        for(int i=0; i < types.length; i++){
            for(int j=0; j < values.length; j++){
                cards.add(types[i] + values[j]);
            }
        }

        Collections.shuffle(cards);
    }

    public void initPlayers(String... names){
        if (names.length > PLAY_NUM || names.length < 2) {
            System.out.println("玩家人数不对，至少要有2人，不多于5人参与");
            return;
        } else {
            for (int i = 0; i < names.length; i++) {
                players[i] = names[i];
            }
        }
    }

    public void initPlayerCards(){
        for (int i = 0; i < players.length; i++) {
            if (players[i]!=null && !players[i].equals("")) {
                playersCards[i] = new LinkedList<String>();
            }
        }
    }

    public void deleverCard(String first){
        
    }
}
