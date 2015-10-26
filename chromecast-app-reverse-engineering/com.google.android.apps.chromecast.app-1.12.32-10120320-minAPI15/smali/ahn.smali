.class final Lahn;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x2288d511ce8549edL


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Z


# direct methods
.method constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    .prologue
    .line 1425
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1426
    iput-object p1, p0, Lahn;->a:Ljava/lang/String;

    .line 1427
    iput-boolean p2, p0, Lahn;->b:Z

    .line 1428
    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 3

    .prologue
    .line 1431
    new-instance v0, Lahm;

    iget-object v1, p0, Lahn;->a:Ljava/lang/String;

    iget-boolean v2, p0, Lahn;->b:Z

    .line 2284
    invoke-direct {v0, v1, v2}, Lahm;-><init>(Ljava/lang/String;Z)V

    .line 1431
    return-object v0
.end method
