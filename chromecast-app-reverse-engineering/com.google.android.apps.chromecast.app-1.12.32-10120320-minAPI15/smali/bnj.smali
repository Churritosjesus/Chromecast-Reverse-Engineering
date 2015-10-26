.class final Lbnj;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lats;


# instance fields
.field private synthetic a:Lbnt;

.field private synthetic b:Lbmu;


# direct methods
.method constructor <init>(Lbmu;Lbnt;)V
    .locals 0

    .prologue
    .line 1187
    iput-object p1, p0, Lbnj;->b:Lbmu;

    iput-object p2, p0, Lbnj;->a:Lbnt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 1192
    if-nez p1, :cond_0

    .line 1197
    :goto_0
    return-void

    .line 1196
    :cond_0
    iget-object v0, p0, Lbnj;->a:Lbnt;

    .line 1298
    iget-object v0, v0, Lbnt;->l:Landroid/widget/ImageView;

    .line 1196
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0
.end method
