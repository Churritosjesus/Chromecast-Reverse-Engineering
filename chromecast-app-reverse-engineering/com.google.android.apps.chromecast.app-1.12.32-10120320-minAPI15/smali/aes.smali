.class final Laes;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laea;


# instance fields
.field private synthetic a:Ljava/lang/String;

.field private synthetic b:Laer;


# direct methods
.method constructor <init>(Laer;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 252
    iput-object p1, p0, Laes;->b:Laer;

    iput-object p2, p0, Laes;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 252
    check-cast p1, Landroid/graphics/Bitmap;

    .line 1255
    iget-object v1, p0, Laes;->b:Laer;

    iget-object v2, p0, Laes;->a:Ljava/lang/String;

    .line 1281
    iget-object v0, v1, Laer;->a:Laew;

    invoke-interface {v0, v2, p1}, Laew;->a(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 1284
    iget-object v0, v1, Laer;->b:Ljava/util/HashMap;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laev;

    .line 1286
    if-eqz v0, :cond_0

    .line 1390
    iput-object p1, v0, Laev;->a:Landroid/graphics/Bitmap;

    .line 1291
    invoke-virtual {v1, v2, v0}, Laer;->a(Ljava/lang/String;Laev;)V

    .line 252
    :cond_0
    return-void
.end method
