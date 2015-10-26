.class final Lapl;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbwg;


# instance fields
.field private synthetic a:Ljava/lang/Runnable;

.field private synthetic b:Lapk;


# direct methods
.method constructor <init>(Lapk;Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 114
    iput-object p1, p0, Lapl;->b:Lapk;

    iput-object p2, p0, Lapl;->a:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    .prologue
    .line 127
    invoke-static {}, Lapk;->d()Lblp;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    .line 128
    return-void
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 117
    invoke-static {}, Lapk;->d()Lblp;

    .line 118
    iget-object v0, p0, Lapl;->b:Lapk;

    iget-object v0, v0, Lapk;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-nez v0, :cond_0

    .line 123
    :goto_0
    return-void

    .line 122
    :cond_0
    iget-object v0, p0, Lapl;->a:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_0
.end method
