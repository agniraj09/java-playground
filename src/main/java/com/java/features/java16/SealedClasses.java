package com.java.features.java16;

sealed interface JungleAnimal permits Monkey, Snake {}

final class Monkey implements JungleAnimal {}

non-sealed class Snake implements JungleAnimal {}

public class SealedClasses extends Snake {}
