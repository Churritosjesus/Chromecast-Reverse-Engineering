.class public final Lct;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public final a:Lcy;

.field private final b:Ldm;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ldm;)V
    .locals 2

    .prologue
    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    if-nez p2, :cond_0

    .line 89
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "sessionToken must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 91
    :cond_0
    iput-object p2, p0, Lct;->b:Ldm;

    .line 93
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    .line 94
    new-instance v0, Lcz;

    invoke-direct {v0, p1, p2}, Lcz;-><init>(Landroid/content/Context;Ldm;)V

    iput-object v0, p0, Lct;->a:Lcy;

    .line 98
    :goto_0
    return-void

    .line 96
    :cond_1
    new-instance v0, Lda;

    iget-object v1, p0, Lct;->b:Ldm;

    invoke-direct {v0, v1}, Lda;-><init>(Ldm;)V

    iput-object v0, p0, Lct;->a:Lcy;

    goto :goto_0
.end method


# virtual methods
.method public final a()Ldc;
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lct;->a:Lcy;

    invoke-interface {v0}, Lcy;->a()Ldc;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcu;)V
    .locals 2

    .prologue
    .line 288
    if-nez p1, :cond_0

    .line 289
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "callback cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 291
    :cond_0
    iget-object v0, p0, Lct;->a:Lcy;

    invoke-interface {v0, p1}, Lcy;->a(Lcu;)V

    .line 292
    return-void
.end method
