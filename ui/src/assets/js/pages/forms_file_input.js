$(function() {
    // dropify file input
    altair_form_file_dropify.init();
});


altair_form_file_dropify = {
    init: function() {

        $('.dropify').dropify();

        $('.dropify-fr').dropify({
            messages: {
                default: 'Glissez-déposez un fichier ici ou cliquez',
                replace: 'Glissez-déposez un fichier ou cliquez pour remplacer',
                remove:  'Supprimer',
                error:   'Désolé, le fichier est trop volumineux'
            },
            error: {
                'fileSize': 'Le fichier est trop volumineux (max {{ value }}).',
                'minWidth': 'La largeur de l\'image est trop petite (min {{ value }}px).',
                'maxWidth': 'L\'image est trop large (max {{ value }}px).',
                'minHeight': 'La hauteur de l\'image est trop petite (min {{ value }}px).',
                'maxHeight': 'La hauteur de l\'image est trop grande (max {{ value }}px ).'
            }
        });

    }
};