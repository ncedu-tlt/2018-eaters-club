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
    <link rel="stylesheet" href="../../../resources/static/css/main_styles.css">

    <!-- Font awesome connection-->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.1/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">

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
        <div class="row my-3 px-3">
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

                    <div id="carouselExampleIndicators" class="carousel slide d-flex justify-content-center" data-ride="carousel">
                        <ol class="carousel-indicators">
                            <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                            <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                            <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                        </ol>
                        <div class="carousel-inner" style="width: 50em">
                            <div class="carousel-item active">
                                <div class="card mb-3">
                                    <img class="card-img-top" src="../../../resources/static/img/test1.jpg" alt="First slide">

                                    <!-- Rating block-->
                                    <div class="rating">
                                        <span class="fa fa-star" id="star1" onclick="add(this,1)"></span>
                                        <span class="fa fa-star" id="star2" onclick="add(this,2)"></span>
                                        <span class="fa fa-star" id="star3" onclick="add(this,3)"></span>
                                        <span class="fa fa-star" id="star4" onclick="add(this,4)"></span>
                                        <span class="fa fa-star" id="star5" onclick="add(this,5)"></span>
                                    </div>

                                    <div class="card-body">
                                        <h5 class="card-title">Картошка по-французски</h5>
                                        <p class="card-text" id="card-description-1">
                                            Картошка по-французски запекается в духовке с мясом и луком. Очень простой рецепт, но картошка по-французски - это всегда очень вкусно и аппетитно.
                                        </p>

                                        <p class="card-text"><small class="text-muted">#tags</small></p>
                                    </div>
                                </div>
                            </div>

                            <div class="carousel-item">
                                <div class="card mb-3">
                                    <img class="card-img-top" src="../../../resources/static/img/test2.jpg" alt="First slide">

                                    <!-- Rating block-->
                                    <div class="rating">
                                        <span class="fa fa-star" id="star1" onclick="add(this,1)"></span>
                                        <span class="fa fa-star" id="star2" onclick="add(this,2)"></span>
                                        <span class="fa fa-star" id="star3" onclick="add(this,3)"></span>
                                        <span class="fa fa-star" id="star4" onclick="add(this,4)"></span>
                                        <span class="fa fa-star" id="star5" onclick="add(this,5)"></span>
                                    </div>

                                    <div class="card-body">
                                        <h5 class="card-title">Recipe 2</h5>
                                        <p class="card-text" id="card-description-1">
                                            Description
                                        </p>

                                        <p class="card-text"><small class="text-muted">#tags</small></p>
                                    </div>
                                </div>
                            </div>

                            <div class="carousel-item">
                                <div class="card mb-3">
                                    <img class="card-img-top" src="../../../resources/static/img/test3.jpg" alt="First slide">

                                    <!-- Rating block-->
                                    <div class="rating">
                                        <span class="fa fa-star" id="star1" onclick="add(this,1)"></span>
                                        <span class="fa fa-star" id="star2" onclick="add(this,2)"></span>
                                        <span class="fa fa-star" id="star3" onclick="add(this,3)"></span>
                                        <span class="fa fa-star" id="star4" onclick="add(this,4)"></span>
                                        <span class="fa fa-star" id="star5" onclick="add(this,5)"></span>
                                    </div>

                                    <div class="card-body">
                                        <h5 class="card-title">Recipe 3</h5>
                                        <p class="card-text" id="card-description-1">
                                            Description
                                        </p>

                                        <p class="card-text"><small class="text-muted">#tags</small></p>
                                    </div>
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
                <p class="text-center">Tags cloud</p>
            </div>
        </div>

        <div class="row px-3">
            <!-- Tags cloud-->
            <div class="col-12 rounded" style="height: 10em; background-color: #ffe5b4;">
                <p class="text-center">We recommend</p>


            </div>
        </div>
    </main><!-- /.container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

    <!-- Star rating script
    ================================================== -->
    <script src="../../../resources/static/js/star_rating.js"></script>
</body>

</html>
