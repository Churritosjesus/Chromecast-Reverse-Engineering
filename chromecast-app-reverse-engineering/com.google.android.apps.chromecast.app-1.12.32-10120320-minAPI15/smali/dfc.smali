.class public final Ldfc;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field a:Z

.field b:I

.field c:I

.field d:I

.field e:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 272
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 275
    iput v0, p0, Ldfc;->b:I

    .line 276
    iput v0, p0, Ldfc;->c:I

    .line 277
    iput v0, p0, Ldfc;->d:I

    return-void
.end method


# virtual methods
.method public final a()Ldfb;
    .locals 1

    .prologue
    .line 363
    new-instance v0, Ldfb;

    .line 1014
    invoke-direct {v0, p0}, Ldfb;-><init>(Ldfc;)V

    .line 363
    return-object v0
.end method
