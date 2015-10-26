.class final Lapr;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbwn;


# direct methods
.method constructor <init>(Lapq;)V
    .locals 0

    .prologue
    .line 244
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lbwm;)V
    .locals 3

    .prologue
    .line 244
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 1247
    invoke-static {}, Lapk;->d()Lblp;

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    if-nez p1, :cond_0

    .line 1248
    const-string v0, "null"

    :goto_0
    aput-object v0, v1, v2

    .line 244
    return-void

    .line 2000
    :cond_0
    iget-object v0, p1, Lcom/google/android/gms/common/api/Status;->g:Ljava/lang/String;

    goto :goto_0
.end method
