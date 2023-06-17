<html>
  <head>
    <title>Welcome Page</title>
    <link href="/webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">

    <style>
      .carousel-item {
        width: 100%;
        height: 100vh;
        background-size: cover;
        background-position: center;
        background-repeat: no-repeat;
      }

      .carousel-item::before {
        content: "";
        background-color: #2e3347;
        position: absolute;
        height: 100vh;
        width: 100%;
        top: 0;
        right: 0;
        left: 0;
        bottom: 0;
      }

      .carousel-container {
        display: flex;
        justify-content: center;
        align-items: center;
        position: absolute;
        bottom: 0;
        top: 0;
        left: 0;
        right: 0;
      }

      .carousel-content {
        text-align: center;
      }

      h2 {
        color: #fff;
        margin-bottom: 30px;
        font-size: 48px;
        font-weight: 700;
      }

      p {
        width: 80%;
        animation-delay: 0.4s;
        margin: 0 auto 30px auto;
        color: #fff;
      }

      .btn-go {
        font-family: "Roboto", sans-serif;
        font-weight: 500;
        font-size: 14px;
        letter-spacing: 1px;
        display: inline-block;
        padding: 12px 32px;
        border-radius: 50px;
        transition: 0.5s;
        line-height: 1;
        margin: 10px;
        color: #fff;
        animation-delay: 0.8s;
        border: 2px solid #1bbca3;
      }

      .btn-get-started:hover {
        background: #1bbca3;
        color: #fff;
        text-decoration: none;
      }
    </style>
  </head>
  <body>
    <div class="hero-container">
      <div id="heroCarousel" class="carousel slide carousel-fade" data-bs-ride="carousel" data-bs-interval="5000">

        <ol class="carousel-indicators" id="hero-carousel-indicators"></ol>

        <div class="carousel-inner" role="listbox">

          <div class="carousel-item active" style="background-image: url(assets/img/slide/slide-1.jpg);">
            <div class="carousel-container">
              <div class="carousel-content">
                <h2 class="animate__animated animate__fadeInDown">Welcome ${name}</span></h2>
                <p class="animate__animated animate__fadeInUp">
                Navigate to the "Employee Details" section to edit and update your personal particulars.
                </p>
                <a href="employee-list" class="btn-go animate__animated animate__fadeInUp scrollto">Manage Employee Details</a>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <script src="/webjars/jquery/3.6.0/jquery.min.js"></script>
    <script src="/webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
  </body>
</html>