var EDITOR = 'editor';
var EDITOR_CONTROLS = 'editor_controls';
var IMAGE_PATH = CONTEXT_ROOT + "/images/actions/";
var IMAGE_TYPE = "png";

function editStyle(cmd, value) {
	document.execCommand(cmd, true, value);
}

function createEditorControl(controlsElement, cmd, image) {
	createEditorControl(controlsElement, cmd, image, null);
}

function createLink() {
	var url = prompt("Add Link", "http://", "URL:");
	editStyle('createLink', url);
}

function linkImage() {
	var url = prompt("Insert Image", "http://", "Image URL:");
	editStyle('insertImage', url);
}

function createCode() {
	var language = prompt("Programming Language", "XML", "");
	editStyle('insertHTML', '<pre class="sh_' + language.toLowerCase() + '">Some Code</pre>');
}

function createEditorControl(controlsElement, cmd, image, value) {
	var img = document.createElement("img");
	img.setAttribute("src", IMAGE_PATH + image + "." + IMAGE_TYPE);

	var link = document.createElement("a");
	link.setAttribute("href", "#");
	link.appendChild(img);

	var cmdType = typeof (cmd);

	if (cmdType == 'string') {
		link.setAttribute("onclick", "editStyle('" + cmd + "', '" + value
				+ "');");
		img.setAttribute("alt", cmd);
	} else if (cmdType == 'function') {
		link.setAttribute("onclick", cmd.name + "();");
		img.setAttribute("alt", cmd.name);
	}

	controlsElement.appendChild(link);
}

function createEditorControls() {
	var editorControls = document.getElementById(EDITOR_CONTROLS);

	if (editorControls.hasChildNodes()) {
		return;
	}
	
//	createEditorControl(editorControls, "undo", "undo");
//	createEditorControl(editorControls, "redo", "redo");

	createEditorControl(editorControls, "bold", "format_text_bold");
	createEditorControl(editorControls, "italic", "format_text_italic");
	createEditorControl(editorControls, "underline", "format_text_underline");
	createEditorControl(editorControls, "strikeThrough", "format_text_strikethrough");

	createEditorControl(editorControls, createLink, "text_html");
	createEditorControl(editorControls, linkImage, "image");
	
	createEditorControl(editorControls, "insertHorizontalRule", "ruler");
	
	createEditorControl(editorControls, "insertOrderedList", "format_list_ordered");
	createEditorControl(editorControls, "insertUnorderedList", "format_list_unordered");
	
	createEditorControl(editorControls, "indent", "indent");
	createEditorControl(editorControls, "outdent", "unindent");
	
//	createEditorControl(editorControls, "justifyLeft", "text_left");
//	createEditorControl(editorControls, "justifyCenter", "text_center");
//	createEditorControl(editorControls, "justifyRight", "text_right");
	
	createEditorControl(editorControls, "insertParagraph", "key_enter");
	
	createEditorControl(editorControls, createCode, "source_cpp");
}

function enableDesignMode() {
	createEditorControls();
}