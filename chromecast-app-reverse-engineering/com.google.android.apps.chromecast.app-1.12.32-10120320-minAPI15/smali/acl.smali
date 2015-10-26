.class final Lacl;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Labs;


# instance fields
.field final synthetic a:Lacb;

.field private synthetic b:Lacx;

.field private synthetic c:Laco;


# direct methods
.method constructor <init>(Lacb;Lacx;Laco;)V
    .locals 0

    .prologue
    .line 853
    iput-object p1, p0, Lacl;->a:Lacb;

    iput-object p2, p0, Lacl;->b:Lacx;

    iput-object p3, p0, Lacl;->c:Laco;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Landroid/graphics/Bitmap;)V
    .locals 2

    .prologue
    .line 876
    iget-object v0, p0, Lacl;->a:Lacb;

    iget-object v1, p0, Lacl;->c:Laco;

    invoke-static {v0, v1, p1}, Lacb;->a(Lacb;Laco;Landroid/graphics/Bitmap;)V

    .line 881
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 883
    iget-object v0, p0, Lacl;->a:Lacb;

    invoke-virtual {v0}, Lacb;->invalidate()V

    .line 892
    :goto_0
    return-void

    .line 885
    :cond_0
    iget-object v0, p0, Lacl;->a:Lacb;

    new-instance v1, Lacm;

    invoke-direct {v1, p0}, Lacm;-><init>(Lacl;)V

    invoke-virtual {v0, v1}, Lacb;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method


# virtual methods
.method public final b()V
    .locals 0

    .prologue
    .line 858
    invoke-virtual {p0}, Lacl;->c()V

    .line 859
    return-void
.end method

.method public final c()V
    .locals 3

    .prologue
    .line 863
    iget-object v0, p0, Lacl;->b:Lacx;

    invoke-virtual {v0}, Lacx;->a()[B

    move-result-object v0

    .line 864
    const/4 v1, 0x0

    array-length v2, v0

    invoke-static {v0, v1, v2}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 866
    invoke-direct {p0, v0}, Lacl;->a(Landroid/graphics/Bitmap;)V

    .line 867
    return-void
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 872
    iget-object v0, p0, Lacl;->a:Lacb;

    invoke-static {v0}, Lacb;->j(Lacb;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-direct {p0, v0}, Lacl;->a(Landroid/graphics/Bitmap;)V

    .line 873
    return-void
.end method
