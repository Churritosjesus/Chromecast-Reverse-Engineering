.class public final Ldhn;
.super Ldge;
.source "PG"


# instance fields
.field private final a:Ldfo;

.field private final b:Ldkd;


# direct methods
.method public constructor <init>(Ldfo;Ldkd;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ldge;-><init>()V

    .line 28
    iput-object p1, p0, Ldhn;->a:Ldfo;

    .line 29
    iput-object p2, p0, Ldhn;->b:Ldkd;

    .line 30
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .prologue
    .line 38
    iget-object v0, p0, Ldhn;->a:Ldfo;

    invoke-static {v0}, Ldhl;->a(Ldfo;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final c()Ldkd;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Ldhn;->b:Ldkd;

    return-object v0
.end method
