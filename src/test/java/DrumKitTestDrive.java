import jdk.nashorn.internal.ir.annotations.Ignore;

@Ignore
class DrumKitTestDrive {
    public static void main (String [] args) {

        DrumKit d = new DrumKit();
        d.playSnare();
        d.snare = false;
        d.playTopHat();
    }
}