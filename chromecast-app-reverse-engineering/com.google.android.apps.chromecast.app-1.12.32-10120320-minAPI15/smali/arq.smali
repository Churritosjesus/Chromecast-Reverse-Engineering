.class public final Larq;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lafo;


# instance fields
.field private synthetic a:Ldcj;

.field private synthetic b:Larp;


# direct methods
.method public constructor <init>(Larp;Ldcj;)V
    .locals 0

    .prologue
    .line 453
    iput-object p1, p0, Larq;->b:Larp;

    iput-object p2, p0, Larq;->a:Ldcj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 472
    iget-object v0, p0, Larq;->b:Larp;

    invoke-static {v0}, Larp;->a(Larp;)Lblp;

    .line 473
    iget-object v0, p0, Larq;->b:Larp;

    .line 1612
    iget-object v0, v0, Lj;->y:Lm;

    .line 473
    sget v1, Lb;->V:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    .line 474
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 475
    return-void
.end method

.method public final a(Lafq;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 479
    iget-object v0, p0, Larq;->b:Larp;

    invoke-static {v0}, Larp;->a(Larp;)Lblp;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v2

    .line 480
    iget-object v0, p0, Larq;->b:Larp;

    .line 2612
    iget-object v0, v0, Lj;->y:Lm;

    .line 480
    sget v1, Lb;->V:I

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    .line 481
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 482
    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 453
    check-cast p1, Lakz;

    .line 4056
    iget-object v0, p1, Lakz;->a:Lafb;

    .line 3456
    if-nez v0, :cond_1

    .line 3457
    iget-object v0, p0, Larq;->b:Larp;

    invoke-static {v0}, Larp;->a(Larp;)Lblp;

    .line 3458
    :cond_0
    :goto_0
    return-void

    .line 3460
    :cond_1
    iget-object v0, p0, Larq;->b:Larp;

    .line 5056
    iget-object v1, p1, Lakz;->a:Lafb;

    .line 3461
    invoke-static {v0, v1}, Larp;->a(Larp;Lafb;)Ldcm;

    move-result-object v0

    .line 3462
    if-eqz v0, :cond_0

    .line 3465
    iget-object v1, p0, Larq;->b:Larp;

    iget-object v2, p0, Larq;->a:Ldcj;

    .line 3466
    invoke-static {v1, v0, v2}, Larp;->a(Larp;Ldcm;Ldcj;)Lbbw;

    move-result-object v0

    .line 3467
    iget-object v1, p0, Larq;->b:Larp;

    .line 5612
    iget-object v1, v1, Lj;->y:Lm;

    .line 3467
    invoke-static {v1}, Latf;->a(Landroid/content/Context;)Latf;

    move-result-object v1

    invoke-virtual {v1, v0}, Latf;->a(Lads;)V

    goto :goto_0
.end method
