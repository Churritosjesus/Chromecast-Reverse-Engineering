.class public final Lfe;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static a:Lff;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 89
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 90
    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    .line 91
    new-instance v0, Lfh;

    invoke-direct {v0}, Lfh;-><init>()V

    sput-object v0, Lfe;->a:Lff;

    .line 95
    :goto_0
    return-void

    .line 93
    :cond_0
    new-instance v0, Lfg;

    invoke-direct {v0}, Lfg;-><init>()V

    sput-object v0, Lfe;->a:Lff;

    goto :goto_0
.end method

.method public static a(II)I
    .locals 1

    .prologue
    .line 201
    sget-object v0, Lfe;->a:Lff;

    invoke-interface {v0, p0, p1}, Lff;->a(II)I

    move-result v0

    return v0
.end method
