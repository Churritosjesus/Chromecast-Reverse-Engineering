.class public final Lbga;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Latr;


# instance fields
.field private synthetic a:Ljava/lang/String;

.field private synthetic b:Laea;

.field private synthetic c:Ladz;

.field private synthetic d:Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;Ljava/lang/String;Laea;Ladz;)V
    .locals 0

    .prologue
    .line 144
    iput-object p1, p0, Lbga;->d:Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;

    iput-object p2, p0, Lbga;->a:Ljava/lang/String;

    iput-object p3, p0, Lbga;->b:Laea;

    iput-object p4, p0, Lbga;->c:Ladz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ldax;)V
    .locals 5

    .prologue
    .line 147
    new-instance v0, Ldbo;

    invoke-direct {v0}, Ldbo;-><init>()V

    .line 148
    iput-object p1, v0, Ldbo;->a:Ldax;

    .line 149
    iget-object v1, p0, Lbga;->a:Ljava/lang/String;

    iput-object v1, v0, Ldbo;->b:Ljava/lang/String;

    .line 151
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->i()Latf;

    move-result-object v1

    new-instance v2, Lbfw;

    iget-object v3, p0, Lbga;->b:Laea;

    iget-object v4, p0, Lbga;->c:Ladz;

    invoke-direct {v2, v0, v3, v4}, Lbfw;-><init>(Ldbo;Laea;Ladz;)V

    invoke-virtual {v1, v2}, Latf;->a(Lads;)V

    .line 153
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    .line 154
    return-void
.end method
