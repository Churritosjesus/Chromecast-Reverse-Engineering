.class final Log;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final a:Log;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 263
    new-instance v0, Log;

    invoke-direct {v0}, Log;-><init>()V

    sput-object v0, Log;->a:Log;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 262
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .prologue
    .line 262
    check-cast p1, Luh;

    check-cast p2, Luh;

    .line 1874
    iget-object v0, p1, Luh;->c:Ljava/lang/String;

    .line 2874
    iget-object v1, p2, Luh;->c:Ljava/lang/String;

    .line 1267
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    .line 262
    return v0
.end method
