.class final Latj;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laey;


# instance fields
.field private synthetic a:Ljava/lang/String;

.field private synthetic b:Lats;

.field private synthetic c:Latf;


# direct methods
.method constructor <init>(Latf;Ljava/lang/String;Lats;)V
    .locals 0

    .prologue
    .line 239
    iput-object p1, p0, Latj;->c:Latf;

    iput-object p2, p0, Latj;->a:Ljava/lang/String;

    iput-object p3, p0, Latj;->b:Lats;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Laef;)V
    .locals 3

    .prologue
    .line 243
    const/4 v0, 0x2

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v0, 0x0

    iget-object v2, p0, Latj;->a:Ljava/lang/String;

    aput-object v2, v1, v0

    const/4 v2, 0x1

    if-nez p1, :cond_0

    const-string v0, "null"

    :goto_0
    aput-object v0, v1, v2

    .line 244
    return-void

    .line 243
    :cond_0
    invoke-virtual {p1}, Laef;->getMessage()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final a(Laex;Z)V
    .locals 2

    .prologue
    .line 248
    .line 1375
    iget-object v0, p1, Laex;->a:Landroid/graphics/Bitmap;

    .line 249
    if-eqz v0, :cond_0

    .line 250
    iget-object v1, p0, Latj;->b:Lats;

    invoke-interface {v1, v0}, Lats;->a(Landroid/graphics/Bitmap;)V

    .line 252
    :cond_0
    return-void
.end method
