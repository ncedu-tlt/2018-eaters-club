<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../../../favicon.ico">

    <title>Welcome to eaters club!</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="../../../resources/static/css/navbar.css">

    <!-- Custom styles for this template -->
    <style type="text/css">
        body {
            padding-top: 4rem;
        }

    </style>
</head>


<body>

    <nav class="navbar navbar-expand-md fixed-top" style="background-color: #f2b442">
        <a class="navbar-brand">
            <!--            <img src="../../../resources/static/img/eaters_club_logo.png" width="80" height="80" alt="">-->
            Eaters Club
        </a>

        <div class="collapse navbar-collapse" id="navbarsExampleDefault">
            <form class="form-inline offset-md-1">
                <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
                <button class="btn btn-warning" type="submit" style="background-color: #ffcd71">Search</button>
            </form>
            <ul class="nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" href="#">Log In</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Register</a>
                </li>
            </ul>
        </div>
    </nav>

    <main role="main" class="container-fluid">
        <div class="row m-1">
            <!--           Categories-->
            <div class="col-2 p-0">
                <div class="rounded mr-3" style="height: 100%; background-color: #ffe5b4;">
                    <p class="text-center">Categories</p>
                </div>
            </div>

            <!--            Main content-->
            <div class="col-8 p-0">
                <div class="rounded mr-3" style="background-color: #ffe5b4;">
                    <p class="text-center">Main content</p>

                    <div id="carouselExampleIndicators" class="carousel slide m-3" data-ride="carousel">
                        <ol class="carousel-indicators">
                            <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                            <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                            <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                        </ol>
                        <div class="carousel-inner" style="width: 50em">
                            <div class="carousel-item active">

                                <div class="card mb-3">
                                    <img class="card-img-top" src="../../../resources/static/img/test1.jpg" alt="First slide">
                                    <div class="card-body">
                                        <h5 class="card-title">Recipe 1</h5>
                                        <p class="card-text"></p>

                                        <p class="card-text"><small class="text-muted">#tags</small></p>
                                    </div>
                                </div>

                                <!--
                                <img src="../../../resources/static/img/test1.jpg" alt="First slide">
                                <div class="carousel-caption d-none d-md-block">
                                    <div class="row">
                                        <div class="col-6 text-left">
                                            <h5>Recipe 1</h5>
                                            <p>Description</p>
                                        </div>
                                        <div class="col-6 text-right">
                                            *<br />
                                            *<br />
                                            *<br />
                                            *<br />
                                            *
                                        </div>
                                    </div>
                                </div>
-->
                            </div>
                            <div class="carousel-item">
                                <img src="../../../resources/static/img/test2.jpg" alt="Second slide">
                                <div class="carousel-caption d-none d-md-block">
                                    <h5>Recipe 2</h5>
                                    <p>Description</p>
                                </div>
                            </div>
                            <div class="carousel-item">
                                <img src="../../../resources/static/img/test3.jpg" alt="Third slide">
                                <div class="carousel-caption d-none d-md-block">
                                    <h5>Recipe 3</h5>
                                    <p>Description</p>
                                </div>
                            </div>
                        </div>
                        <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                            <span class="sr-only">Previous</span>
                        </a>
                        <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                            <span class="carousel-control-next-icon" aria-hidden="true"></span>
                            <span class="sr-only">Next</span>
                        </a>
                    </div>
                </div>
            </div>

            <div class="col-2 rounded d-flex justify-content-center" style="background-color: #ffe5b4;">
                <p class="text-center">We recommend</p>
            </div>
        </div>

        <div class="row m-1">
            <!--                Tags cloud-->
            <div class="col-12 rounded" style="height: 10em; background-color: #ffe5b4;">
                <p class="text-center">Tags cloud</p>
            </div>
        </div>
    </main><!-- /.container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

</body>

</html>
