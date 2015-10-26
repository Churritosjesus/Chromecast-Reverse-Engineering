.class final Lbjb;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/media/MediaPlayer$OnErrorListener;


# instance fields
.field private synthetic a:Lbiy;


# direct methods
.method constructor <init>(Lbiy;)V
    .locals 0

    .prologue
    .line 128
    iput-object p1, p0, Lbjb;->a:Lbiy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onError(Landroid/media/MediaPlayer;II)Z
    .locals 1

    .prologue
    .line 131
    iget-object v0, p0, Lbjb;->a:Lbiy;

    invoke-static {v0}, Lbiy;->a(Lbiy;)Lbjd;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 132
    iget-object v0, p0, Lbjb;->a:Lbiy;

    invoke-static {v0}, Lbiy;->a(Lbiy;)Lbjd;

    move-result-object v0

    invoke-interface {v0, p2, p3}, Lbjd;->a(II)V

    .line 133
    const/4 v0, 0x1

    .line 135
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
