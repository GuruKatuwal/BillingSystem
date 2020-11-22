<script type="text/javascript">
    function getPageNameFromURL() {
        var URL = document.location.href;
        var PageFileName = URL.substring(URL.lastIndexOf('/') + 1);
        return PageFileName;
    }
    $(document).ready(function() {
        var PageName = getPageNameFromURL();
        switch (PageName) {
            case 'viewReport':
                $('#index').addClass("active");
                break;
            case 'viewTrail':
                $('#viewTrail').addClass("active");
                break;
            case 'addReport':
                $('#addReport').addClass("active");
                break;
            case 'addTrail':
                $('#addTrail').addClass("active");
                break;
            case 'signInConfirmation.jsp':
                $('#signInConfirmation').addClass("active");
                break;
            case 'about.jsp':
                $('#about').addClass("active");
                break;
            case 'signUp.jsp':
                $('#signUp').addClass("active");
                break;
            default:
                $('#home').addClass("active");
                break;
        }
    });
</script>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="viewReport" id="home">Monthly Report</a>
        </div>
    </div>
</nav>
