.class final Lom;
.super Lcu;
.source "PG"


# instance fields
.field private synthetic a:Loi;


# direct methods
.method constructor <init>(Loi;)V
    .locals 0

    .prologue
    .line 464
    iput-object p1, p0, Lom;->a:Loi;

    invoke-direct {p0}, Lcu;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 467
    iget-object v0, p0, Lom;->a:Loi;

    invoke-static {v0}, Loi;->f(Loi;)Lct;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 468
    iget-object v0, p0, Lom;->a:Loi;

    invoke-static {v0}, Loi;->f(Loi;)Lct;

    move-result-object v0

    iget-object v1, p0, Lom;->a:Loi;

    invoke-static {v1}, Loi;->g(Loi;)Lom;

    move-result-object v1

    invoke-virtual {v0, v1}, Lct;->a(Lcu;)V

    .line 469
    iget-object v0, p0, Lom;->a:Loi;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Loi;->a(Loi;Lct;)Lct;

    .line 471
    :cond_0
    return-void
.end method

.method public final a(Lci;)V
    .locals 2

    .prologue
    .line 481
    iget-object v1, p0, Lom;->a:Loi;

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-static {v1, v0}, Loi;->a(Loi;Lcf;)Lcf;

    .line 482
    iget-object v0, p0, Lom;->a:Loi;

    invoke-static {v0}, Loi;->e(Loi;)Z

    .line 483
    return-void

    .line 481
    :cond_0
    invoke-virtual {p1}, Lci;->a()Lcf;

    move-result-object v0

    goto :goto_0
.end method

.method public final a(Ldq;)V
    .locals 1

    .prologue
    .line 475
    iget-object v0, p0, Lom;->a:Loi;

    invoke-static {v0, p1}, Loi;->a(Loi;Ldq;)Ldq;

    .line 476
    iget-object v0, p0, Lom;->a:Loi;

    invoke-static {v0}, Loi;->e(Loi;)Z

    .line 477
    return-void
.end method
