@file:JsModule("usehooks-ts")
@file:JsNonModule

package hooks

@JsName("useDarkMode")
external fun useDarkMode(defaultValue: Boolean? = definedExternally): UseDarkModeOutput

external interface UseDarkModeOutput {
    val isDarkMode: Boolean
    val toggle: () -> Unit
    val enable: () -> Unit
    val disable: () -> Unit
}