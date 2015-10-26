.class final Lbbs;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbwn;


# instance fields
.field private synthetic a:Lbbn;


# direct methods
.method constructor <init>(Lbbn;)V
    .locals 0

    .prologue
    .line 240
    iput-object p1, p0, Lbbs;->a:Lbbn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lbwm;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 240
    check-cast p1, Lbvg;

    .line 1243
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-interface {p1}, Lbvg;->b()Lcom/google/android/gms/common/api/Status;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/Status;->a()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    aput-object v1, v0, v2

    .line 1244
    invoke-interface {p1}, Lbvg;->b()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1245
    iget-object v0, p0, Lbbs;->a:Lbbn;

    invoke-interface {p1}, Lbvg;->a()Lcom/google/android/gms/cast/CastDevice;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbbn;->a(Lcom/google/android/gms/cast/CastDevice;)V

    :goto_0
    return-void

    .line 1247
    :cond_0
    iget-object v0, p0, Lbbs;->a:Lbbn;

    invoke-static {v0, v2}, Lbbn;->a(Lbbn;Z)V

    goto :goto_0
.end method
