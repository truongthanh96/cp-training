import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class AndyBillPower {
  public static String power(final int k, final int[] powers) {
    final LinkedList<Character> characterLinkedList = new LinkedList<>();
    final List<Character> characterList = new ArrayList<>();
    for (var i = 0; i < powers.length; i++) {
      final Character character = new Character(i, powers[i]);
      characterLinkedList.add(character);
      characterList.add(character);
    }
    int currentTeam = 1;
    while (!characterLinkedList.isEmpty()) {
      final int max = characterLinkedList.stream().mapToInt(c -> c.power).max().getAsInt();
      Character maxChar = null;

      for (final Character character : characterLinkedList) {

        if (character.power == max) {
          maxChar = character;
        }
      }
      final int finalCurrentTeam = currentTeam;
      final Character finalMaxChar = maxChar;
      characterLinkedList.removeIf(
          c -> {
            if (c.index == finalMaxChar.index) {
              c.team = finalCurrentTeam;
              return false;
            }
            if (c.index >= finalMaxChar.index - k && c.index <= finalMaxChar.index + k) {
              c.team = finalCurrentTeam;
              return true;
            }
            return false;
          });
      characterLinkedList.remove(maxChar);

      currentTeam = currentTeam == 1 ? 2 : 1;
    }
    return characterList.stream().map(c -> String.valueOf(c.team)).collect(Collectors.joining(""));
  }

  public static void main(final String[] args) {
    final String power = power(1, new int[] {11, 23, 8, 20, 5, 17, 14});
    System.out.println(power);
    assert power.equals("1112211");
  }

  public static class Character {
    public int index;
    public int power;
    public int team = -1;

    public Character(final int index, final int power) {
      this.index = index;
      this.power = power;
    }
  }
}
