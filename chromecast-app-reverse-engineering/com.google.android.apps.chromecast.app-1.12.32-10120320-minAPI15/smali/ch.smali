.class public final Lch;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field a:Ljava/lang/String;

.field b:Ljava/lang/CharSequence;

.field c:Ljava/lang/CharSequence;

.field d:Ljava/lang/CharSequence;

.field e:Landroid/graphics/Bitmap;

.field f:Landroid/net/Uri;

.field g:Landroid/os/Bundle;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 265
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 266
    return-void
.end method


# virtual methods
.method public final a()Lcf;
    .locals 8

    .prologue
    .line 355
    new-instance v0, Lcf;

    iget-object v1, p0, Lch;->a:Ljava/lang/String;

    iget-object v2, p0, Lch;->b:Ljava/lang/CharSequence;

    iget-object v3, p0, Lch;->c:Ljava/lang/CharSequence;

    iget-object v4, p0, Lch;->d:Ljava/lang/CharSequence;

    iget-object v5, p0, Lch;->e:Landroid/graphics/Bitmap;

    iget-object v6, p0, Lch;->f:Landroid/net/Uri;

    iget-object v7, p0, Lch;->g:Landroid/os/Bundle;

    .line 1031
    invoke-direct/range {v0 .. v7}, Lcf;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/os/Bundle;)V

    .line 355
    return-object v0
.end method
