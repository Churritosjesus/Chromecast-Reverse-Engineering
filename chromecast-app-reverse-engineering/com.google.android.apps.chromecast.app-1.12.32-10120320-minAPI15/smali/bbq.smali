.class final Lbbq;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbwn;


# instance fields
.field private synthetic a:Lcom/google/android/gms/cast/CastDevice;

.field private synthetic b:Lbbn;


# direct methods
.method constructor <init>(Lbbn;Lcom/google/android/gms/cast/CastDevice;)V
    .locals 0

    .prologue
    .line 171
    iput-object p1, p0, Lbbq;->b:Lbbn;

    iput-object p2, p0, Lbbq;->a:Lcom/google/android/gms/cast/CastDevice;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lbwm;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 171
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 1174
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1175
    new-array v0, v3, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 2000
    iget v2, p1, Lcom/google/android/gms/common/api/Status;->f:I

    .line 1176
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    .line 1177
    iget-object v0, p0, Lbbq;->b:Lbbn;

    invoke-static {v0, v3}, Lbbn;->a(Lbbn;Z)V

    :goto_0
    return-void

    .line 1180
    :cond_0
    iget-object v0, p0, Lbbq;->b:Lbbn;

    iget-object v1, p0, Lbbq;->a:Lcom/google/android/gms/cast/CastDevice;

    invoke-virtual {v0, v1}, Lbbn;->a(Lcom/google/android/gms/cast/CastDevice;)V

    goto :goto_0
.end method
