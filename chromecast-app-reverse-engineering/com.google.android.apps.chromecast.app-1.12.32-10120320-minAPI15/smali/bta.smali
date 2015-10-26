.class public final Lbta;
.super Ljava/lang/Object;

# interfaces
.implements Lbwb;


# instance fields
.field final a:Lcom/google/android/gms/cast/CastDevice;

.field final b:Lbtc;

.field final c:I


# direct methods
.method public constructor <init>(Lbtb;)V
    .locals 1

    .prologue
    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lbtb;->a:Lcom/google/android/gms/cast/CastDevice;

    iput-object v0, p0, Lbta;->a:Lcom/google/android/gms/cast/CastDevice;

    iget-object v0, p1, Lbtb;->b:Lbtc;

    iput-object v0, p0, Lbta;->b:Lbtc;

    .line 1000
    const/4 v0, 0x0

    .line 0
    iput v0, p0, Lbta;->c:I

    return-void
.end method
