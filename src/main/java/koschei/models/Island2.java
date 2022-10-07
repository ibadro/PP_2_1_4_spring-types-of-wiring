package koschei.models;

public class Island2 {

    private Wood3 wood;

    public Island2(Wood3 wood) {
        this.wood = wood;
    }

    @Override
    public String toString() {
        return ", на острове дерево " + wood.toString();
    }
}
// Island2 связан с Wood3 через конструктор
// Аннотация не требуется, т.к. бин конструируется в классе AppConfig.
