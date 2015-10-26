.class public final Lddt;
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

.field private static final synthetic i:[I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x5

    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    .line 89
    sput v3, Lddt;->a:I

    .line 90
    sput v4, Lddt;->b:I

    .line 91
    sput v5, Lddt;->c:I

    .line 92
    sput v6, Lddt;->d:I

    .line 93
    sput v7, Lddt;->e:I

    .line 94
    const/4 v0, 0x6

    sput v0, Lddt;->f:I

    .line 95
    const/4 v0, 0x7

    sput v0, Lddt;->g:I

    .line 96
    const/16 v0, 0x8

    sput v0, Lddt;->h:I

    .line 88
    const/16 v0, 0x8

    new-array v0, v0, [I

    const/4 v1, 0x0

    sget v2, Lddt;->a:I

    aput v2, v0, v1

    sget v1, Lddt;->b:I

    aput v1, v0, v3

    sget v1, Lddt;->c:I

    aput v1, v0, v4

    sget v1, Lddt;->d:I

    aput v1, v0, v5

    sget v1, Lddt;->e:I

    aput v1, v0, v6

    sget v1, Lddt;->f:I

    aput v1, v0, v7

    const/4 v1, 0x6

    sget v2, Lddt;->g:I

    aput v2, v0, v1

    const/4 v1, 0x7

    sget v2, Lddt;->h:I

    aput v2, v0, v1

    sput-object v0, Lddt;->i:[I

    return-void
.end method

.method public static a()[I
    .locals 1

    .prologue
    .line 88
    sget-object v0, Lddt;->i:[I

    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    return-object v0
.end method
