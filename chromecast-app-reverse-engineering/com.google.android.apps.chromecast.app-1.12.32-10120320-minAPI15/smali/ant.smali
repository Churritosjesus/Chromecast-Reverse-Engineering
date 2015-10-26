.class final Lant;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Layw;


# instance fields
.field private synthetic a:Ljava/lang/Runnable;

.field private synthetic b:Layq;

.field private synthetic c:Lapd;

.field private synthetic d:Lbdf;

.field private synthetic e:Land;


# direct methods
.method constructor <init>(Land;Ljava/lang/Runnable;Layq;Lapd;Lbdf;)V
    .locals 0

    .prologue
    .line 1311
    iput-object p1, p0, Lant;->e:Land;

    iput-object p2, p0, Lant;->a:Ljava/lang/Runnable;

    iput-object p3, p0, Lant;->b:Layq;

    iput-object p4, p0, Lant;->c:Lapd;

    iput-object p5, p0, Lant;->d:Lbdf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 0

    .prologue
    .line 1314
    return-void
.end method

.method public final a(Laym;)V
    .locals 3

    .prologue
    .line 1319
    iget-object v0, p0, Lant;->e:Land;

    invoke-static {v0}, Land;->a(Land;)Lbdf;

    move-result-object v0

    .line 1362
    iget-object v0, v0, Lbdf;->n:Ljava/lang/String;

    .line 2066
    iget-object v1, p1, Laym;->a:Ljava/lang/String;

    .line 1321
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1323
    iget-object v0, p0, Lant;->e:Land;

    invoke-static {v0}, Land;->l(Land;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lant;->a:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1324
    iget-object v0, p0, Lant;->b:Layq;

    invoke-virtual {v0}, Layq;->c()V

    .line 1325
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    iget-object v1, p0, Lant;->c:Lapd;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lapd;->a(I)Lapd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 1326
    iget-object v0, p0, Lant;->e:Land;

    .line 2073
    iget-object v1, p1, Laym;->b:Ljava/lang/String;

    .line 1326
    iput-object v1, v0, Land;->k:Ljava/lang/String;

    .line 1328
    iget-object v0, p0, Lant;->e:Land;

    invoke-static {v0}, Land;->o(Land;)Lbdu;

    move-result-object v0

    iget-object v1, p0, Lant;->e:Land;

    invoke-static {v1}, Land;->n(Land;)Lbfs;

    move-result-object v1

    .line 2130
    iget-object v1, v1, Lbfs;->a:Ljava/lang/String;

    .line 2160
    iput-object v1, v0, Lbdu;->f:Ljava/lang/String;

    .line 1329
    iget-object v0, p0, Lant;->e:Land;

    invoke-static {v0}, Land;->o(Land;)Lbdu;

    move-result-object v0

    .line 3073
    iget-object v1, p1, Laym;->b:Ljava/lang/String;

    .line 3152
    iput-object v1, v0, Lbdu;->d:Ljava/lang/String;

    .line 1330
    iget-object v0, p0, Lant;->e:Land;

    invoke-static {v0}, Land;->m(Land;)Lbdm;

    move-result-object v0

    invoke-virtual {v0}, Lbdm;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1331
    iget-object v0, p0, Lant;->e:Land;

    iget-object v1, p0, Lant;->d:Lbdf;

    invoke-static {v0, v1}, Land;->c(Land;Lbdf;)V

    .line 1336
    :cond_0
    :goto_0
    return-void

    .line 1333
    :cond_1
    iget-object v0, p0, Lant;->e:Land;

    iget-object v1, p0, Lant;->d:Lbdf;

    invoke-static {v0, v1}, Land;->d(Land;Lbdf;)V

    goto :goto_0
.end method

.method public final b(Laym;)V
    .locals 0

    .prologue
    .line 1340
    return-void
.end method
