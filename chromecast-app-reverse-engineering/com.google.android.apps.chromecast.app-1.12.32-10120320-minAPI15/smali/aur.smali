.class public final Laur;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:Lblp;

.field public b:Ldcj;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Lblp;

    const-string v1, "UserSettingsMetadata"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Laur;->a:Lblp;

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Laur;->b:Ldcj;

    .line 26
    return-void
.end method

.method public constructor <init>(Ldcj;)V
    .locals 2

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Lblp;

    const-string v1, "UserSettingsMetadata"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Laur;->a:Lblp;

    .line 29
    iput-object p1, p0, Laur;->b:Ldcj;

    .line 30
    return-void
.end method
