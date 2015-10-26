.class public final Lhk;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static a:Lhn;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 141
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 142
    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 143
    new-instance v0, Lhp;

    invoke-direct {v0}, Lhp;-><init>()V

    sput-object v0, Lhk;->a:Lhn;

    .line 153
    :goto_0
    return-void

    .line 144
    :cond_0
    const/16 v1, 0x12

    if-lt v0, v1, :cond_1

    .line 145
    new-instance v0, Lho;

    invoke-direct {v0}, Lho;-><init>()V

    sput-object v0, Lhk;->a:Lhn;

    goto :goto_0

    .line 146
    :cond_1
    const/16 v1, 0xe

    if-lt v0, v1, :cond_2

    .line 147
    new-instance v0, Lhm;

    invoke-direct {v0}, Lhm;-><init>()V

    sput-object v0, Lhk;->a:Lhn;

    goto :goto_0

    .line 148
    :cond_2
    const/16 v1, 0xb

    if-lt v0, v1, :cond_3

    .line 149
    new-instance v0, Lhl;

    invoke-direct {v0}, Lhl;-><init>()V

    sput-object v0, Lhk;->a:Lhn;

    goto :goto_0

    .line 151
    :cond_3
    new-instance v0, Lhn;

    invoke-direct {v0}, Lhn;-><init>()V

    sput-object v0, Lhk;->a:Lhn;

    goto :goto_0
.end method

.method public static a(Landroid/view/ViewGroup;Z)V
    .locals 2

    .prologue
    .line 199
    sget-object v0, Lhk;->a:Lhn;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Lhn;->a(Landroid/view/ViewGroup;Z)V

    .line 200
    return-void
.end method
