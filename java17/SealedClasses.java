package java17;

public class SealedClasses {

}

sealed interface A permits B, C {

}

final class B implements A {

}

final class C implements A {

}