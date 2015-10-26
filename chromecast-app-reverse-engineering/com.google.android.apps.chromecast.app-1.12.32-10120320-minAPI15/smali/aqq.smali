.class final Laqq;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbwn;


# instance fields
.field private synthetic a:Laqp;


# direct methods
.method constructor <init>(Laqp;)V
    .locals 0

    .prologue
    .line 327
    iput-object p1, p0, Laqq;->a:Laqp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lbwm;)V
    .locals 4

    .prologue
    .line 327
    check-cast p1, Lbb;

    .line 1330
    invoke-interface {p1}, Lbb;->b()Lcom/google/android/gms/common/api/Status;

    move-result-object v1

    .line 1331
    invoke-virtual {v1}, Lcom/google/android/gms/common/api/Status;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1332
    invoke-static {}, Laqj;->h()Lblp;

    const/4 v0, 0x2

    new-array v2, v0, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v0, p0, Laqq;->a:Laqp;

    iget-boolean v0, v0, Laqp;->a:Z

    if-eqz v0, :cond_1

    .line 1333
    const-string v0, "Playing "

    :goto_0
    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    .line 327
    :cond_0
    return-void

    .line 1333
    :cond_1
    const-string v0, "Pausing "

    goto :goto_0
.end method
