.class final Lapq;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Z

.field private synthetic b:Z

.field private synthetic c:Lapk;


# direct methods
.method constructor <init>(Lapk;ZZ)V
    .locals 0

    .prologue
    .line 239
    iput-object p1, p0, Lapq;->c:Lapk;

    iput-boolean p2, p0, Lapq;->a:Z

    iput-boolean p3, p0, Lapq;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 242
    iget-boolean v0, p0, Lapq;->a:Z

    if-eqz v0, :cond_1

    .line 243
    sget-object v0, Lbsr;->b:Lbsu;

    iget-object v1, p0, Lapq;->c:Lapk;

    iget-object v1, v1, Lapk;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0, v1}, Lbsu;->b(Lcom/google/android/gms/common/api/GoogleApiClient;)Lbwj;

    move-result-object v0

    .line 244
    new-instance v1, Lapr;

    invoke-direct {v1, p0}, Lapr;-><init>(Lapq;)V

    invoke-interface {v0, v1}, Lbwj;->a(Lbwn;)V

    .line 262
    :goto_0
    iget-boolean v0, p0, Lapq;->b:Z

    if-eqz v0, :cond_0

    .line 263
    iget-object v0, p0, Lapq;->c:Lapk;

    invoke-virtual {v0}, Lapk;->b()V

    .line 264
    iget-object v0, p0, Lapq;->c:Lapk;

    iget-object v0, v0, Lapk;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->c()V

    .line 266
    :cond_0
    return-void

    .line 253
    :cond_1
    sget-object v0, Lbsr;->b:Lbsu;

    iget-object v1, p0, Lapq;->c:Lapk;

    iget-object v1, v1, Lapk;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0, v1}, Lbsu;->a(Lcom/google/android/gms/common/api/GoogleApiClient;)Lbwj;

    move-result-object v0

    .line 254
    new-instance v1, Laps;

    invoke-direct {v1, p0}, Laps;-><init>(Lapq;)V

    invoke-interface {v0, v1}, Lbwj;->a(Lbwn;)V

    goto :goto_0
.end method
