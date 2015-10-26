.class final Laqh;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbwn;


# instance fields
.field private synthetic a:Laqg;


# direct methods
.method constructor <init>(Laqg;)V
    .locals 0

    .prologue
    .line 219
    iput-object p1, p0, Laqh;->a:Laqg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lbwm;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 219
    check-cast p1, Lbst;

    .line 1222
    invoke-interface {p1}, Lbst;->b()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    .line 1223
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 1224
    invoke-interface {p1}, Lbst;->a()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v4

    .line 1225
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1226
    iget-object v0, p0, Laqh;->a:Laqg;

    iget-object v0, v0, Laqg;->a:Laqd;

    .line 2025
    iget-object v0, v0, Laqd;->e:Laqf;

    .line 1226
    invoke-interface {v0}, Laqf;->a()V

    :goto_0
    return-void

    .line 1228
    :cond_0
    iget-object v0, p0, Laqh;->a:Laqg;

    iget-object v0, v0, Laqg;->a:Laqd;

    .line 3025
    invoke-virtual {v0, v4}, Laqd;->a(Z)V

    goto :goto_0
.end method
