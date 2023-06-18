package components

import emotion.react.css
import js.core.jso
import mui.system.PropsWithSx
import react.FC
import react.dom.html.ReactHTML.div

@RequiresOptIn
@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.BINARY)
annotation class ExperimentalDangerousRawHTML

@ExperimentalDangerousRawHTML
val dangerousRawHtml = FC<DangerousRawHTMLProps> {
    div {
        css {
            +it.sx
        }
        dangerouslySetInnerHTML = jso {
            __html = it.rawHtml
        }
    }
}

external interface DangerousRawHTMLProps : PropsWithSx {
    var rawHtml: String
}