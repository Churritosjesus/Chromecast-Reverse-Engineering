.class public final Lawe;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:Landroid/os/Handler;

.field final b:I

.field private final c:Lblp;


# direct methods
.method public constructor <init>(Landroid/os/Handler;I)V
    .locals 2

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lawe;->a:Landroid/os/Handler;

    .line 26
    new-instance v0, Lblp;

    const-string v1, "SoundPlayer"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lawe;->c:Lblp;

    .line 27
    iput p2, p0, Lawe;->b:I

    .line 28
    return-void
.end method
