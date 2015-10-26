.class public final Lcif;
.super Ljava/lang/Object;


# instance fields
.field a:Landroid/graphics/Bitmap;

.field b:Landroid/os/Bundle;

.field c:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcif;->b:Landroid/os/Bundle;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcif;->c:Ljava/util/ArrayList;

    return-void
.end method
