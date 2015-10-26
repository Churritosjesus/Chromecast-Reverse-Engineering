.class final Labk;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Landroid/graphics/drawable/StateListDrawable;

.field private synthetic b:Labj;


# direct methods
.method constructor <init>(Labj;Landroid/graphics/drawable/StateListDrawable;)V
    .locals 0

    .prologue
    .line 292
    iput-object p1, p0, Labk;->b:Labj;

    iput-object p2, p0, Labk;->a:Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 295
    iget-object v0, p0, Labk;->a:Landroid/graphics/drawable/StateListDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/StateListDrawable;->getCurrent()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 296
    iget-object v0, p0, Labk;->b:Labj;

    .line 1036
    iget-object v0, v0, Labj;->a:Labo;

    .line 296
    invoke-interface {v0}, Labo;->a()V

    .line 298
    :cond_0
    return-void
.end method
