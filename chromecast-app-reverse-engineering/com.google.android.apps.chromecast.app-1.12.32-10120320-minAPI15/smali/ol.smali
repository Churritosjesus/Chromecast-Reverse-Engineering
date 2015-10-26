.class final Lol;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Loi;


# direct methods
.method constructor <init>(Loi;)V
    .locals 0

    .prologue
    .line 486
    iput-object p1, p0, Lol;->a:Loi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .prologue
    const/4 v2, 0x3

    .line 489
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    .line 490
    sget v1, Lb;->v:I

    if-eq v0, v1, :cond_0

    sget v1, Lb;->n:I

    if-ne v0, v1, :cond_6

    .line 491
    :cond_0
    iget-object v1, p0, Lol;->a:Loi;

    invoke-static {v1}, Loi;->d(Loi;)Luh;

    move-result-object v1

    invoke-virtual {v1}, Luh;->a()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 492
    iget-object v1, p0, Lol;->a:Loi;

    invoke-static {v1}, Loi;->h(Loi;)Ltz;

    sget v1, Lb;->v:I

    if-ne v0, v1, :cond_2

    const/4 v0, 0x2

    .line 1396
    :goto_0
    if-ltz v0, :cond_1

    if-le v0, v2, :cond_3

    .line 1398
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported reason to unselect route"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 492
    :cond_2
    const/4 v0, 0x1

    goto :goto_0

    .line 1400
    :cond_3
    invoke-static {}, Ltz;->f()V

    .line 1402
    sget-object v1, Ltz;->a:Luc;

    invoke-static {}, Ltz;->c()Luh;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Luc;->a(Luh;I)V

    .line 496
    :cond_4
    iget-object v0, p0, Lol;->a:Loi;

    invoke-virtual {v0}, Loi;->dismiss()V

    .line 516
    :cond_5
    :goto_1
    return-void

    .line 497
    :cond_6
    sget v1, Lb;->s:I

    if-ne v0, v1, :cond_8

    .line 498
    iget-object v0, p0, Lol;->a:Loi;

    invoke-static {v0}, Loi;->f(Loi;)Lct;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lol;->a:Loi;

    invoke-static {v0}, Loi;->i(Loi;)Ldq;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 499
    iget-object v0, p0, Lol;->a:Loi;

    invoke-static {v0}, Loi;->i(Loi;)Ldq;

    move-result-object v0

    .line 2324
    iget v0, v0, Ldq;->a:I

    .line 499
    if-ne v0, v2, :cond_7

    .line 500
    iget-object v0, p0, Lol;->a:Loi;

    invoke-static {v0}, Loi;->f(Loi;)Lct;

    move-result-object v0

    invoke-virtual {v0}, Lct;->a()Ldc;

    move-result-object v0

    invoke-virtual {v0}, Ldc;->b()V

    goto :goto_1

    .line 502
    :cond_7
    iget-object v0, p0, Lol;->a:Loi;

    invoke-static {v0}, Loi;->f(Loi;)Lct;

    move-result-object v0

    invoke-virtual {v0}, Lct;->a()Ldc;

    move-result-object v0

    invoke-virtual {v0}, Ldc;->a()V

    goto :goto_1

    .line 505
    :cond_8
    sget v1, Lb;->u:I

    if-ne v0, v1, :cond_5

    .line 506
    iget-object v0, p0, Lol;->a:Loi;

    invoke-static {v0}, Loi;->d(Loi;)Luh;

    move-result-object v0

    .line 3240
    iget-object v0, v0, Luh;->n:Landroid/content/IntentSender;

    .line 507
    if-eqz v0, :cond_5

    .line 509
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :try_start_0
    invoke-virtual/range {v0 .. v5}, Landroid/content/IntentSender;->sendIntent(Landroid/content/Context;ILandroid/content/Intent;Landroid/content/IntentSender$OnFinished;Landroid/os/Handler;)V

    .line 510
    iget-object v0, p0, Lol;->a:Loi;

    invoke-virtual {v0}, Loi;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 511
    :catch_0
    move-exception v0

    .line 512
    const-string v1, "MediaRouteControllerDialog"

    const-string v2, "Error opening route settings."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method
