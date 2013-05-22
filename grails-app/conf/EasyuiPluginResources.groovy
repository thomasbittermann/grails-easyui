import org.grails.plugins.easyui.EasyuiConfig

def theme = EasyuiConfig.theme
def locale = EasyuiConfig.locale

modules = {
	'easyui_core' {
    dependsOn 'jquery'
		resource url: [dir: "js/jquery-easyui/themes"         , file: 'icon.css'                ], disposition: 'head'
		resource url: [dir: "js/jquery-easyui/themes/${theme}", file: 'easyui.css'              ], disposition: 'head'
		resource url: [dir: "js/jquery-easyui"                , file: 'jquery.easyui.min.js'    ], disposition: 'head'
		resource url: [dir: "js/jquery-easyui/locale"         , file: "easyui-lang-${locale}.js"], disposition: 'head'
	}
	
	'easyui_scaffold' {
		dependsOn 'jquery, easyui_core'
		resource url: [plugin: "easyui", dir: "js"       , file: "easyui-scaffold.js"               ], disposition: 'head'
		resource url: [plugin: "easyui", dir: "js/locale", file: "easyui-scaffold-lang-${locale}.js"], disposition: 'head'
		resource url: [plugin: "easyui", dir: "css"      , file: "easyui-scaffold.css"              ], disposition: 'head'
	}
}
