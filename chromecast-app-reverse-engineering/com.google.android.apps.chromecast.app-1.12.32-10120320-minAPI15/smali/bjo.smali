.class public final Lbjo;
.super Ljava/lang/Enum;
.source "PG"


# static fields
.field public static final enum a:I

.field public static final enum b:I

.field public static final enum c:I

.field public static final enum d:I

.field public static final enum e:I

.field public static final enum f:I

.field public static final enum g:I

.field public static final enum h:I

.field public static final enum i:I

.field private static final synthetic j:[I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x5

    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    .line 20
    sput v3, Lbjo;->a:I

    .line 21
    sput v4, Lbjo;->b:I

    .line 22
    sput v5, Lbjo;->c:I

    .line 23
    sput v6, Lbjo;->d:I

    .line 24
    sput v7, Lbjo;->e:I

    .line 25
    const/4 v0, 0x6

    sput v0, Lbjo;->f:I

    .line 26
    const/4 v0, 0x7

    sput v0, Lbjo;->g:I

    .line 27
    const/16 v0, 0x8

    sput v0, Lbjo;->h:I

    .line 28
    const/16 v0, 0x9

    sput v0, Lbjo;->i:I

    .line 19
    const/16 v0, 0x9

    new-array v0, v0, [I

    const/4 v1, 0x0

    sget v2, Lbjo;->a:I

    aput v2, v0, v1

    sget v1, Lbjo;->b:I

    aput v1, v0, v3

    sget v1, Lbjo;->c:I

    aput v1, v0, v4

    sget v1, Lbjo;->d:I

    aput v1, v0, v5

    sget v1, Lbjo;->e:I

    aput v1, v0, v6

    sget v1, Lbjo;->f:I

    aput v1, v0, v7

    const/4 v1, 0x6

    sget v2, Lbjo;->g:I

    aput v2, v0, v1

    const/4 v1, 0x7

    sget v2, Lbjo;->h:I

    aput v2, v0, v1

    const/16 v1, 0x8

    sget v2, Lbjo;->i:I

    aput v2, v0, v1

    sput-object v0, Lbjo;->j:[I

    return-void
.end method

.method public static a()[I
    .locals 1

    .prologue
    .line 19
    sget-object v0, Lbjo;->j:[I

    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    return-object v0
.end method
