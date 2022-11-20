public class Player {

    private int pickedCard;
    private int selectLeft;

    public Player(int selectLeft) {
        this.selectLeft = selectLeft;
    }

    public void setPickedCard(int card) {
        pickedCard = card;
    }

    public int getPickedCardU() {
        return pickedCard;
    }

    public void setSelectionsLeft(int left) {
        selectLeft = left;
    }

    public int getSelectionsLeft() {
        return selectLeft;
    }

    public void reduceSelects() {
        selectLeft -= 1;
    }

}
