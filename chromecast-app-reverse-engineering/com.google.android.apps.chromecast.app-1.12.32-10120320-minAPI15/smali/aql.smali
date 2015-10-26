.class final Laql;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Laqj;


# direct methods
.method constructor <init>(Laqj;)V
    .locals 0

    .prologue
    .line 242
    iput-object p1, p0, Laql;->a:Laqj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 245
    iget-object v0, p0, Laql;->a:Laqj;

    invoke-static {v0}, Laqj;->b(Laqj;)Laow;

    move-result-object v0

    sget-object v1, Lbsr;->b:Lbsu;

    iget-object v2, p0, Laql;->a:Laqj;

    iget-object v2, v2, Laqj;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v1, v2}, Lbsu;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Laow;->a(D)V

    .line 246
    return-void
.end method
