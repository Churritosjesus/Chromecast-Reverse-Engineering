.class final Lajw;
.super Landroid/webkit/WebViewClient;
.source "PG"


# instance fields
.field private synthetic a:Lajq;


# direct methods
.method constructor <init>(Lajq;)V
    .locals 0

    .prologue
    .line 422
    iput-object p1, p0, Lajw;->a:Lajq;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 506
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 507
    iget-object v0, p0, Lajw;->a:Lajq;

    invoke-static {v0}, Lajq;->b(Lajq;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 508
    iget-object v0, p0, Lajw;->a:Lajq;

    invoke-static {v0}, Lajq;->c(Lajq;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 514
    :cond_0
    iget-object v0, p0, Lajw;->a:Lajq;

    invoke-static {v0}, Lajq;->d(Lajq;)Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    .line 515
    iget-object v0, p0, Lajw;->a:Lajq;

    invoke-static {v0}, Lajq;->e(Lajq;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 516
    iget-object v0, p0, Lajw;->a:Lajq;

    invoke-static {v0}, Lajq;->f(Lajq;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 517
    iget-object v0, p0, Lajw;->a:Lajq;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lajq;->a(Lajq;Z)Z

    .line 518
    return-void
.end method

.method public final onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 4

    .prologue
    .line 497
    const-string v1, "FacebookSDK.WebDialog"

    const-string v2, "Webview loading URL: "

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {v1, v0}, Laji;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 498
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 499
    iget-object v0, p0, Lajw;->a:Lajq;

    invoke-static {v0}, Lajq;->b(Lajq;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 500
    iget-object v0, p0, Lajw;->a:Lajq;

    invoke-static {v0}, Lajq;->c(Lajq;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 502
    :cond_0
    return-void

    .line 497
    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 479
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    .line 480
    iget-object v0, p0, Lajw;->a:Lajq;

    new-instance v1, Lafp;

    invoke-direct {v1, p3, p2, p4}, Lafp;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Lajq;->a(Ljava/lang/Throwable;)V

    .line 481
    return-void
.end method

.method public final onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 488
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V

    .line 490
    invoke-virtual {p2}, Landroid/webkit/SslErrorHandler;->cancel()V

    .line 491
    iget-object v0, p0, Lajw;->a:Lajq;

    new-instance v1, Lafp;

    const/16 v2, -0xb

    invoke-direct {v1, v3, v2, v3}, Lafp;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Lajq;->a(Ljava/lang/Throwable;)V

    .line 493
    return-void
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 7

    .prologue
    const/4 v3, -0x1

    const/4 v4, 0x1

    .line 425
    const-string v1, "FacebookSDK.WebDialog"

    const-string v2, "Redirect URL: "

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {v1, v0}, Laji;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 426
    iget-object v0, p0, Lajw;->a:Lajq;

    invoke-static {v0}, Lajq;->a(Lajq;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 427
    iget-object v0, p0, Lajw;->a:Lajq;

    invoke-virtual {v0, p2}, Lajq;->a(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v5

    .line 429
    const-string v0, "error"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 430
    if-nez v0, :cond_0

    .line 431
    const-string v0, "error_type"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 434
    :cond_0
    const-string v1, "error_msg"

    invoke-virtual {v5, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 435
    if-nez v1, :cond_1

    .line 436
    const-string v1, "error_message"

    invoke-virtual {v5, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 438
    :cond_1
    if-nez v1, :cond_2

    .line 439
    const-string v1, "error_description"

    invoke-virtual {v5, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 441
    :cond_2
    const-string v2, "error_code"

    invoke-virtual {v5, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 443
    invoke-static {v2}, Laji;->a(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_c

    .line 445
    :try_start_0
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    .line 451
    :goto_1
    invoke-static {v0}, Laji;->a(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 452
    invoke-static {v1}, Laji;->a(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5

    if-ne v2, v3, :cond_5

    .line 453
    iget-object v0, p0, Lajw;->a:Lajq;

    .line 1334
    iget-object v1, v0, Lajq;->b:Lajx;

    if-eqz v1, :cond_3

    iget-boolean v1, v0, Lajq;->d:Z

    if-nez v1, :cond_3

    .line 1335
    iput-boolean v4, v0, Lajq;->d:Z

    .line 1336
    iget-object v1, v0, Lajq;->b:Lajx;

    const/4 v2, 0x0

    invoke-interface {v1, v5, v2}, Lajx;->a(Landroid/os/Bundle;Lafq;)V

    .line 1337
    invoke-virtual {v0}, Lajq;->dismiss()V

    :cond_3
    :goto_2
    move v0, v4

    .line 473
    :goto_3
    return v0

    .line 425
    :cond_4
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 447
    :catch_0
    move-exception v2

    move v2, v3

    goto :goto_1

    .line 454
    :cond_5
    if-eqz v0, :cond_7

    const-string v3, "access_denied"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    const-string v3, "OAuthAccessDeniedException"

    .line 455
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 456
    :cond_6
    iget-object v0, p0, Lajw;->a:Lajq;

    invoke-virtual {v0}, Lajq;->cancel()V

    goto :goto_2

    .line 457
    :cond_7
    const/16 v3, 0x1069

    if-ne v2, v3, :cond_8

    .line 458
    iget-object v0, p0, Lajw;->a:Lajq;

    invoke-virtual {v0}, Lajq;->cancel()V

    goto :goto_2

    .line 460
    :cond_8
    new-instance v3, Lafs;

    invoke-direct {v3, v2, v0, v1}, Lafs;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 461
    iget-object v0, p0, Lajw;->a:Lajq;

    new-instance v2, Lafz;

    invoke-direct {v2, v3, v1}, Lafz;-><init>(Lafs;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lajq;->a(Ljava/lang/Throwable;)V

    goto :goto_2

    .line 464
    :cond_9
    const-string v0, "fbconnect://cancel"

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 465
    iget-object v0, p0, Lajw;->a:Lajq;

    invoke-virtual {v0}, Lajq;->cancel()V

    move v0, v4

    .line 466
    goto :goto_3

    .line 467
    :cond_a
    const-string v0, "touch"

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 468
    const/4 v0, 0x0

    goto :goto_3

    .line 471
    :cond_b
    iget-object v0, p0, Lajw;->a:Lajq;

    invoke-virtual {v0}, Lajq;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    .line 472
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 471
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    move v0, v4

    .line 473
    goto :goto_3

    :cond_c
    move v2, v3

    goto/16 :goto_1
.end method
