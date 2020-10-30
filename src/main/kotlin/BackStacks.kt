import java.util.ArrayDeque

interface Parcelable

inline fun <reified T : Parcelable?> ArrayDeque<T>.resetBeforeLast() {
  @Suppress("ControlFlowWithEmptyBody")
  while (!T::class.java.isAssignableFrom(pop()!!::class.java));
}
