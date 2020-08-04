package mock;

public class SecurityCenter {
    private final DoorPanel doorPanel;

    public SecurityCenter(DoorPanel doorPanel) {
        this.doorPanel = doorPanel;
    }

    public int switchOn() {
        return doorPanel.close();
    }
}
