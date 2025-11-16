package java17;

public sealed class SealedClasses permits B, C {

}

sealed interface A permits B, C {

}

final class B extends SealedClasses implements A {

}

final class C extends SealedClasses implements A {

}